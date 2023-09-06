package exec01;

import java.util.Scanner;

public class Exam011 {

	public static void main(String[] args) {
		/* 자판기
		 * 업그레이드버전
		 */

		Scanner sc = new Scanner(System.in);
		boolean adminCheck = true;
		boolean modeCheck = true;
		boolean check = true;
		boolean menuChoice = false;
		
		String[] menu = {"코카콜라","코카콜라제로","칠성사이다","칠성사이다제로","커피","물"};
		int[] price = {1800,1900,1800,1900,1500,1000};
		int[] store = {10,10,10,10,10,10};
		int[] money = {1000,500,100};
		
		int select = 0;
		String mode = "";
		String adminMenu = "";

		String adminId = "aaa";
		String adminPw = "111";
		int error = 0;
		
		int inputMoney = 0;
		int wallet = 0;
		
		do {
			System.out.println("======================================================");
			System.out.printf("1번. 관리자모드%n2번. 자판기 모드%n3번. 이용종료%n원하시는 모드를 선택해주세요 : ");
			mode = sc.nextLine();
			
			switch(mode) {
			case "1" :																								//관리자모드
				if(error >= 5) {																					//아이디 또는 비밀번호 5회오류시 관리자모드 제한
					System.out.println("------------------------------------------------------");
					System.out.printf("아이디 또는 비밀번호 %d회 오류로 관리자모드가 제한됩니다!\n", error);
					System.out.printf("관리자모드 이용을 원하시면 재시작 해주시기 바랍니다!\n");
				} else {
					System.out.println("------------------------------------------------------");
					System.out.printf("아이디를 입력해주세요 : ");
					String id = sc.nextLine();
					
					if(adminId.equals(id)) {
						System.out.println("------------------------------------------------------");
						System.out.printf("비밀번호를 입력해주세요 : ");
						String pw = sc.nextLine();
						
						if(adminPw.equals(pw)) {
							do {
								System.out.println("-----------------------관리자 메뉴-----------------------");
								System.out.printf("1번. 재고현황%n2번. 재고변경%n3번. 메뉴변경%n4번. 금액변경%n5번. 관리자모드종료%n");
								System.out.printf("원하는 메뉴를 골라주세요(1번~5번) : ");
								adminMenu = sc.nextLine();
								
								switch(adminMenu) {
								case "1" :																				//재고 현황
									System.out.println("------------------------재고 현황------------------------");
									for(int i=0;i<menu.length;i++) {
										System.out.printf("%d. %s(%d원) : %d개\n",i,menu[i],price[i],store[i]);
									}
									adminCheck = true;
									break;
									
								case "2" :																				//재고 변경
									System.out.println("------------------------재고 변경------------------------");
									for(int i=0;i<menu.length;i++) {
										System.out.printf("%d. %s(%d원) : %d개\n",i,menu[i],price[i],store[i]);
									}
									do {																				//1~4번 외 버튼 입력시 다시 입력
										System.out.println("------------------------------------------------------");
										System.out.println("1.재고추가 2.재고차감 3.재고삭제 4.재고직접입력 5.관리자 메뉴");
										System.out.printf("원하는 작업을 선택해주세요 : ");
										select = Integer.parseInt(sc.nextLine());
										
										switch(select) {
										case 1:
											System.out.println("------------------------------------------------------");
											for(int i=0;i<menu.length;i++) {
												System.out.printf("%d. %s(%d원) : %d개\n",i,menu[i],price[i],store[i]);
											}
											System.out.printf("변경을 원하는 메뉴를 골라주세요(0~5) : ");
											select = Integer.parseInt(sc.nextLine());
											for(int i=0;i<menu.length;i++) {
												if(i==select) {
													System.out.println("------------------------------------------------------");
													System.out.printf("추가하고자 하는 수량을 입력해주세요 : ");
													store[i] += Integer.parseInt(sc.nextLine());
													System.out.printf("%s의 현재 재고 : %d\n",menu[i],store[i]);
												}
											}
											menuChoice = false;
											break;
											
										case 2:
											System.out.println("------------------------------------------------------");
											for(int i=0;i<menu.length;i++) {
												System.out.printf("%d. %s(%d원) : %d개\n",i,menu[i],price[i],store[i]);
											}
											System.out.printf("변경을 원하는 메뉴를 골라주세요(0~5) : ");
											select = Integer.parseInt(sc.nextLine());
											for(int i=0;i<menu.length;i++) {
												if(i==select) {
													System.out.println("------------------------------------------------------");
													System.out.printf("차감하고자 하는 수량을 입력해주세요 : ");
													int a = Integer.parseInt(sc.nextLine());
													if(store[i]>=a) {
														store[i] -= a;
														System.out.printf("%s의 현재 재고 : %d\n",menu[i],store[i]);
													} else {
														System.out.println("------------------------------------------------------");
														System.out.println("입력된 재고가 남아있는 재고보다 많습니다!");
													}
												}
											}
											menuChoice = false;
											break;

										case 3:
											System.out.println("------------------------------------------------------");
											for(int i=0;i<menu.length;i++) {
												System.out.printf("%d. %s(%d원) : %d개\n",i,menu[i],price[i],store[i]);
											}
											System.out.printf("변경을 원하는 메뉴를 골라주세요(0~5) : ");
											select = Integer.parseInt(sc.nextLine());
											for(int i=0;i<menu.length;i++) {
												if(i==select) {
													store[i] = 0;
													System.out.printf("%s의 현재 재고 : %d\n",menu[i],store[i]);
												}
											}
											menuChoice = false;
											break;

										case 4:
											System.out.println("------------------------------------------------------");
											for(int i=0;i<menu.length;i++) {
												System.out.printf("%d. %s(%d원) : %d개\n",i,menu[i],price[i],store[i]);
											}
											System.out.printf("변경을 원하는 메뉴를 골라주세요(0~5) : ");
											select = Integer.parseInt(sc.nextLine());
											for(int i=0;i<menu.length;i++) {
												if(i==select) {
													System.out.printf("새로운 재고를 입력해주세요 : ");
													store[i] = Integer.parseInt(sc.nextLine());
													System.out.printf("%s의 현재 재고 : %d\n",menu[i],store[i]);
												}
											}
											menuChoice = false;
											break;
											
										case 5:
											menuChoice = false;
											break;
											
										default:
											System.out.println("------------------------------------------------------");
											System.out.println("1~5번 중에 골라주세요!");
											menuChoice = true;
										}
										
									} while(menuChoice);
									adminCheck = true;
									break;																				//재고변경 종료
									
								case "3" :																				//메뉴 변경
									System.out.println("------------------------메뉴 변경------------------------");
									for(int i=0;i<menu.length;i++) {
										System.out.printf("%d. %s(%d원) : %d개\n",i,menu[i],price[i],store[i]);
									}
									
									do {
										System.out.println("------------------------------------------------------");
										System.out.println("변경을 원하는 메뉴를 골라주세요(0~5) : ");
										select = Integer.parseInt(sc.nextLine());
										if(select>=0&&select<=5) {
											System.out.printf("새로운 메뉴 이름을 적어주세요 : ");
											menu[select] = sc.nextLine();
											System.out.println("------------------------------------------------------");
											System.out.printf("%s의 재고가 초기화되었습니다.\n",menu[select]);
											store[select] = 0;
											System.out.println("--------------재고관리탭에서 재고를 입력해주세요---------------");
											menuChoice = false;
										} else {
											System.out.println("------------------------------------------------------");
											System.out.println("존재하지 않는 메뉴 번호입니다.");
											menuChoice = true;
										}
									} while(menuChoice);
									adminCheck = true;
									break;
									
								case "4" :																				//금액 변경
									System.out.println("------------------------금액 변경------------------------");
									for(int i=0;i<menu.length;i++) {
										System.out.printf("%d. %s(%d원) : %d개\n",i,menu[i],price[i],store[i]);
									}
									
									do {
										System.out.println("------------------------------------------------------");
										System.out.println("변경을 원하는 메뉴를 골라주세요(0~5) : ");
										select = Integer.parseInt(sc.nextLine());
										if(select>=0&&select<=5) {
											do {
												System.out.printf("변경하고자 하는 금액을 입력해주세요(100원 단위) : ");
												int a = Integer.parseInt(sc.nextLine());
												if(a%100==0) {
													price[select] = a;
													System.out.println("------------------------------------------------------");
													System.out.printf("%s의 금액이 %d원으로 변경되었습니다.\n",menu[select],price[select]);
													menuChoice = false;
												} else {
													System.out.println("------------------------------------------------------");
													System.out.println("-----------------금액은 100원단위로 입력해주세요!-----------------");
													menuChoice = true;
												}
											} while(menuChoice);
										} else {
											System.out.println("------------------------------------------------------");
											System.out.println("존재하지 않는 메뉴 번호입니다.");
											menuChoice = true;
										}
										
									} while(menuChoice);
									adminCheck = true;
									break;
									
								case "5" :
									adminCheck = false;
									break;
									
								default :
									System.out.println("1번~5번 중 하나의 보기를 골라주세요!!");
									adminCheck = true;
								}
							} while(adminCheck);
						} else {
							System.out.println("비밀번호가 일치하지 않습니다!!");
							error++;
							break;
						}
					} else {
						System.out.println("아이디가 일치하지 않습니다!!");
						error++;
						break;
					}
				}
				modeCheck = true;
				break;
				
			case "2" :																							//자판기모드
				do{
					System.out.println("======================================================");
					System.out.println("=================자판기 메뉴=============================");
					System.out.println();
					for(int i=0;i<menu.length;i+=2) {
						System.out.printf("%d.%s(%d원) / %d.%s(%d원)\n",i,menu[i],price[i],i+1,menu[i+1],price[i+1]);
					}
					System.out.printf("6.동전투입 / 7.자판기모드종료\n");
					System.out.println("======================================================");
					System.out.printf("메뉴를 선택해주세요(0~7) : ");
					select = Integer.parseInt(sc.nextLine());
					
					switch(select) {
					case 0,1,2,3,4,5 :
						if(wallet>=price[select]) {
							if(store[select]>0) {
								wallet -= price[select];
								store[select]--;
								System.out.println("======================================================");
								System.out.printf("'%s'(이)가 나왔습니다%n금액은 %d원 남은 잔액은 %d원 입니다.%n", menu[select], price[select], wallet);
							} else {
								System.out.println("======================================================");
								System.out.println("선택하신 메뉴는 현재 품절입니다!");
							}
						} else {
							System.out.println("======================================================");
							System.out.println("잔액이 부족합니다!");
							System.out.printf("현재 잔액 : %d원%n", wallet);
						}
						check = true;
						break;
						
					case 6 :
						System.out.println("======================================================");
						System.out.printf("투입하실 금액을 입력해주세요(100원단위) : ");
						inputMoney = Integer.parseInt(sc.nextLine());												//투입금액
						
						if((inputMoney%100) > 0) {																	//투입금액이 100원단위가 아닐 시 다시 입력.
							System.out.println("======================================================");
							System.out.printf("%n-----금액은 100원단위로 입력해주세요!-----%n%n");
							inputMoney = 0;
							break;
						}
						wallet += inputMoney;
						check = true;
						break;
						
					case 7 :
						check = false;
						break;
						
					default :
						System.out.println("======================================================");
						System.out.printf("---없는 메뉴입니다. 메뉴는 0번부터 7번 사이에서 골라주세요!---%n");							//0번~7번메뉴 외에 메뉴를 고를 시 메뉴 다시 고르기
						check = true;
					}
				} while(check);
				modeCheck = true;
				break;
				
			case "3" :
				System.out.println("======================================================");
				System.out.printf("거스름돈은 %d원입니다.\n",wallet);
				for(int i=0;i<money.length;i++) {
					System.out.printf("%d원 : %d개\n",money[i],wallet/money[i]);
					wallet %= money[i];
				}
				System.out.println("자판기 이용을 종료합니다!");
				System.out.println("======================================================");
				modeCheck = false;
				break;
				
			default :
				System.out.println("======================================================");
				System.out.println("1번~3번 중에서 선택해주세요!!");
				modeCheck = true;
			}
		} while(modeCheck);
		sc.close();
	}

}
