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
		boolean menuChoice = true;
		
		String a = "코카콜라";
		String b = "코카콜라제로";
		String c = "칠성사이다";
		String d = "칠성사이다제로";
		String e = "커피";
		String f = "물";
		
		String selectMenu = "";
		String mode = "";
		String adminMenu = "";

		String adminId = "aaa";
		String adminPw = "111";
		int error = 0;
		
		int modifyStore = 0;
		int modifyPrice = 0;
		
		int aPrice = 1800;
		int bPrice = 1900;
		int cPrice = 1800;
		int dPrice = 1900;
		int ePrice = 1500;
		int fPrice = 1000;
		
		int aStore = 10;
		int bStore = 10;
		int cStore = 10;
		int dStore = 10;
		int eStore = 10;
		int fStore = 10;
		
		int inputMoney = 0;
		int wallet = 0;
		int thousand = 0;
		int fiveHundred = 0;
		int oneHundred = 0;
		
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
									System.out.printf("a. %s(%d원) : %d개%nb. %s(%d원) : %d개%nc. %s(%d원) : %d개%nd. %s(%d원) : %d개%ne. %s(%d원) : %d개%nf. %s(%d원) : %d개%n",
											a, aPrice, aStore, b, bPrice, bStore, c, cPrice, cStore, d, dPrice, dStore, e, ePrice, eStore, f, fPrice, fStore);
									break;
									
								case "2" :																				//재고 변경
									System.out.println("------------------------재고 변경------------------------");
									System.out.printf("a. %s(%d원) : %d개%nb. %s(%d원) : %d개%nc. %s(%d원) : %d개%nd. %s(%d원) : %d개%ne. %s(%d원) : %d개%nf. %s(%d원) : %d개%n",
											a, aPrice, aStore, b, bPrice, bStore, c, cPrice, cStore, d, dPrice, dStore, e, ePrice, eStore, f, fPrice, fStore);
									do {
										System.out.println("------------------------------------------------------");
										System.out.println("변경을 원하는 메뉴를 골라주세요(a~f) : ");
										selectMenu = sc.nextLine();
										
										switch(selectMenu) {																//변경할 메뉴 선택 시 선택별 결과값에 대한 switch문
										case "a" :
											System.out.printf("변경하고자 하는 수량을 적어주세요 : ");
											modifyStore = Integer.parseInt(sc.nextLine());
											aStore = modifyStore;
											menuChoice = false;
											break;
										case "b" :
											System.out.printf("변경하고자 하는 수량을 적어주세요 : ");
											modifyStore = Integer.parseInt(sc.nextLine());
											bStore = modifyStore;
											menuChoice = false;
											break;
										case "c" :
											System.out.printf("변경하고자 하는 수량을 적어주세요 : ");
											modifyStore = Integer.parseInt(sc.nextLine());
											cStore = modifyStore;
											menuChoice = false;
											break;
										case "d" :
											System.out.printf("변경하고자 하는 수량을 적어주세요 : ");
											modifyStore = Integer.parseInt(sc.nextLine());
											dStore = modifyStore;
											menuChoice = false;
											break;
										case "e" :
											System.out.printf("변경하고자 하는 수량을 적어주세요 : ");
											modifyStore = Integer.parseInt(sc.nextLine());
											eStore = modifyStore;
											menuChoice = false;
											break;
										case "f" :
											System.out.printf("변경하고자 하는 수량을 적어주세요 : ");
											modifyStore = Integer.parseInt(sc.nextLine());
											fStore = modifyStore;
											menuChoice = false;
											break;
										default :
											System.out.println("------------------------------------------------------");
											System.out.println("존재하지 않는 메뉴 번호입니다.");
											System.out.println("------------------------------------------------------");
											menuChoice = true;
										}																					//재고변경 switch문 종료
									} while(menuChoice);
									break;																				//재고변경 종료
									
								case "3" :																				//메뉴 변경
									System.out.println("------------------------메뉴 변경------------------------");
									System.out.printf("a. %s(%d원) : %d개%nb. %s(%d원) : %d개%nc. %s(%d원) : %d개%nd. %s(%d원) : %d개%ne. %s(%d원) : %d개%nf. %s(%d원) : %d개%n",
											a, aPrice, aStore, b, bPrice, bStore, c, cPrice, cStore, d, dPrice, dStore, e, ePrice, eStore, f, fPrice, fStore);
									
									do {
										System.out.println("------------------------------------------------------");
										System.out.println("변경을 원하는 메뉴를 골라주세요(a~f) : ");
										selectMenu = sc.nextLine();
										
										switch(selectMenu) {																//변경할 메뉴 선택 시 선택별 결과값에 대한 switch문
										case "a" :
											System.out.println("----------------새로운 메뉴 이름을 적어주세요----------------");
											a = sc.nextLine();
											aStore = 0;
											System.out.println("----------------재고가 초기화 되었습니다!!!-----------------");
											System.out.println("--------------재고관리탭에서 재고를 입력해주세요---------------");
											menuChoice = false;
											break;
											
										case "b" :
											System.out.println("----------------새로운 메뉴 이름을 적어주세요----------------");
											b = sc.nextLine();
											bStore = 0;
											System.out.println("----------------재고가 초기화 되었습니다!!!-----------------");
											System.out.println("--------------재고관리탭에서 재고를 입력해주세요---------------");
											menuChoice = false;
											break;
											
										case "c" :
											System.out.println("----------------새로운 메뉴 이름을 적어주세요----------------");
											c = sc.nextLine();
											cStore = 0;
											System.out.println("----------------재고가 초기화 되었습니다!!!-----------------");
											System.out.println("--------------재고관리탭에서 재고를 입력해주세요---------------");
											menuChoice = false;
											break;
											
										case "d" :
											System.out.println("----------------새로운 메뉴 이름을 적어주세요----------------");
											d = sc.nextLine();
											dStore = 0;
											System.out.println("----------------재고가 초기화 되었습니다!!!-----------------");
											System.out.println("--------------재고관리탭에서 재고를 입력해주세요---------------");
											menuChoice = false;
											break;
											
										case "e" :
											System.out.println("----------------새로운 메뉴 이름을 적어주세요----------------");
											e = sc.nextLine();
											eStore = 0;
											System.out.println("----------------재고가 초기화 되었습니다!!!-----------------");
											System.out.println("--------------재고관리탭에서 재고를 입력해주세요---------------");
											menuChoice = false;
											break;
											
										case "f" :
											System.out.println("----------------새로운 메뉴 이름을 적어주세요----------------");
											f = sc.nextLine();
											fStore = 0;
											System.out.println("----------------재고가 초기화 되었습니다!!!-----------------");
											System.out.println("--------------재고관리탭에서 재고를 입력해주세요---------------");
											menuChoice = false;
											break;
											
										default :
											System.out.println("------------------------------------------------------");
											System.out.println("존재하지 않는 메뉴 번호입니다.");
											menuChoice = true;
										}																					//메뉴변경 종료
									} while(menuChoice);
									break;
									
								case "4" :																				//금액 변경
									System.out.println("------------------------금액 변경------------------------");
									System.out.printf("a. %s(%d원) : %d개%nb. %s(%d원) : %d개%nc. %s(%d원) : %d개%nd. %s(%d원) : %d개%ne. %s(%d원) : %d개%nf. %s(%d원) : %d개%n",
											a, aPrice, aStore, b, bPrice, bStore, c, cPrice, cStore, d, dPrice, dStore, e, ePrice, eStore, f, fPrice, fStore);
									
									do {
										System.out.println("------------------------------------------------------");
										System.out.println("변경을 원하는 메뉴를 골라주세요(a~f) : ");
										selectMenu = sc.nextLine();
										
										switch(selectMenu) {																//변경할 메뉴 선택 시 선택별 결과값에 대한 switch문
										case "a" :
											do {
												System.out.println("----------변경하고자 하는 금액을 적어주세요(100원 단위)----------");
												modifyPrice = Integer.parseInt(sc.nextLine());
												if((modifyPrice%100) > 0) {
													System.out.println("-----------------금액은 100원단위로 입력해주세요!-----------------");
												} else {
													break;
												}
											} while(true);
											aPrice= modifyPrice;
											menuChoice = false;
											break;
											
										case "b" :
											do {
												System.out.println("----------변경하고자 하는 금액을 적어주세요(100원 단위)----------");
												modifyPrice = Integer.parseInt(sc.nextLine());
												if((modifyPrice%100) > 0) {
													System.out.println("-----------------금액은 100원단위로 입력해주세요!-----------------");
												} else {
													break;
												}
											} while(true);
											bPrice= modifyPrice;
											menuChoice = false;
											break;
											
										case "c" :
											do {
												System.out.println("----------변경하고자 하는 금액을 적어주세요(100원 단위)----------");
												modifyPrice = Integer.parseInt(sc.nextLine());
												if((modifyPrice%100) > 0) {
													System.out.println("-----------------금액은 100원단위로 입력해주세요!-----------------");
												} else {
													break;
												}
											} while(true);
											cPrice= modifyPrice;
											menuChoice = false;
											break;
											
										case "d" :
											do {
												System.out.println("----------변경하고자 하는 금액을 적어주세요(100원 단위)----------");
												modifyPrice = Integer.parseInt(sc.nextLine());
												if((modifyPrice%100) > 0) {
													System.out.println("-----------------금액은 100원단위로 입력해주세요!-----------------");
												} else {
													break;
												}
											} while(true);
											dPrice= modifyPrice;
											menuChoice = false;
											break;
											
										case "e" :
											do {
												System.out.println("----------변경하고자 하는 금액을 적어주세요(100원 단위)----------");
												modifyPrice = Integer.parseInt(sc.nextLine());
												if((modifyPrice%100) > 0) {
													System.out.println("-----------------금액은 100원단위로 입력해주세요!-----------------");
												} else {
													break;
												}
											} while(true);
											ePrice= modifyPrice;
											menuChoice = false;
											break;
											
										case "f" :
											do {
												System.out.println("----------변경하고자 하는 금액을 적어주세요(100원 단위)----------");
												modifyPrice = Integer.parseInt(sc.nextLine());
												if((modifyPrice%100) > 0) {
													System.out.println("-----------------금액은 100원단위로 입력해주세요!-----------------");
												} else {
													break;
												}
											} while(true);
											fPrice= modifyPrice;
											menuChoice = false;
											break;
											
										default :
											System.out.println("------------------------------------------------------");
											System.out.println("존재하지 않는 메뉴 번호입니다.");
											System.out.println("------------------------------------------------------");
											menuChoice = true;
										}
									} while(menuChoice);
									break;
									
								case "5" :
									adminCheck = false;
									break;
									
								default :
									System.out.println("1번~5번 중 하나의 보기를 골라주세요!!");	
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
				break;
				
			case "2" :																							//자판기모드
				do{
					System.out.println("======================================================");
					System.out.printf("-------------자판기 메뉴---------------------------------%n1.%s(%d원) / 2.%s(%d원) %n3.%s(%d원) / 4.%s(%d원) %n5.%s(%d원) / 6.%s(%d원) %n7.동전투입 / 0.자판기모드종료%n",
							a, aPrice, b, bPrice, c, cPrice, d, dPrice, e, ePrice, f, fPrice);									//메뉴판
					
					System.out.println("======================================================");
					System.out.printf("메뉴를 선택해주세요(0~7) : ");
					String order = sc.nextLine();
					
						switch(order) {
						case "1" :																		//투입금액이 선택한 메뉴 금액과 같거나 많을 시 정상적으로 주문 진행
							if(wallet-aPrice >= 0) {
								if(aStore>=1) {
									wallet -= aPrice;
									aStore--;
									
									System.out.println("======================================================");
									System.out.printf("'%s'(이)가 나왔습니다%n금액은 %d원 남은 잔액은 %d원 입니다.%n", a, aPrice, wallet);
									break;
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
							
						case "2" :
							
							if(wallet-bPrice >= 0) {
								if(bStore>=1) {
									wallet -= bPrice;
									bStore--;
									
									System.out.println("======================================================");
									System.out.printf("'%s'(이)가 나왔습니다%n금액은 %d원 남은 잔액은 %d원 입니다.%n", b, bPrice, wallet);
									break;
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
							
						case "3" :
							if(wallet-cPrice >= 0) {
								if(cStore>=1) {
									wallet -= cPrice;
									cStore--;
									
									System.out.println("======================================================");
									System.out.printf("'%s'(이)가 나왔습니다%n금액은 %d원 남은 잔액은 %d원 입니다.%n", c, cPrice, wallet);
									break;
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
							
						case "4" :
							
							if(wallet-dPrice >= 0) {
								if(dStore>=1) {
									wallet -= dPrice;
									dStore--;
									
									System.out.println("======================================================");
									System.out.printf("'%s'(이)가 나왔습니다%n금액은 %d원 남은 잔액은 %d원 입니다.%n", d, dPrice, wallet);
									break;
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
							
						case "5" :
							
							if(wallet-ePrice >= 0) {
								if(eStore>=1) {
									wallet -= ePrice;
									eStore--;
									
									System.out.println("======================================================");
									System.out.printf("'%s'(이)가 나왔습니다%n금액은 %d원 남은 잔액은 %d원 입니다.%n", e, ePrice, wallet);
									break;
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
							
						case "6" :
							
							if(wallet-fPrice >= 0) {
								if(fStore>=1) {
									wallet -= fPrice;
									fStore--;
									
									System.out.println("======================================================");
									System.out.printf("'%s'(이)가 나왔습니다%n금액은 %d원 남은 잔액은 %d원 입니다.%n", f, fPrice, wallet);
									break;
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
						case "7" :
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
							
						case "0" :
							check = false;
							break;
							
						default :
							System.out.println("======================================================");
							System.out.printf("---없는 메뉴입니다. 메뉴는 0번부터 7번 사이에서 골라주세요!---%n");							//0번~7번메뉴 외에 메뉴를 고를 시 메뉴 다시 고르기
							check = true;
						}
				} while(check);
				break;
				
			case "3" :
				thousand = wallet/1000;
				fiveHundred = (wallet%1000)/500;
				oneHundred = (wallet%500)/100;
				System.out.println("======================================================");
				System.out.printf("거스름돈은 %d원이고, 1000원 %d장, 500원 %d개, 100원 %d개입니다.%n", wallet, thousand, fiveHundred, oneHundred);
				System.out.println("자판기 이용을 종료합니다!");
				System.out.println("======================================================");
				modeCheck = false;
				break;
				
			default :
				System.out.println("======================================================");
				System.out.println("1번~3번 중에서 선택해주세요!!");
			}
		} while(modeCheck);
		sc.close();
	}

}
