import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String player1 ="";
        String player2 ="";
        Scanner in = new Scanner(System.in);

        boolean done = true;
        String finished = "Y";

        do {
            do {
                System.out.println("Player 1 enter your move [R, P, S]");
                player1 = in.nextLine();
                if (player1.equalsIgnoreCase("R") || player1.equalsIgnoreCase("P") || player1.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println("You entered the wrong value");
                    done = false;
                }
            } while (!done);
            do {
                System.out.println("Player 2 enter your move [R, P, S]");
                player2 = in.nextLine();
                if (player2.equalsIgnoreCase("R") || player2.equalsIgnoreCase("P") || player2.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println("You entered the wrong value");
                    done = false;
                }
            }while (!done);
            if (player1.equalsIgnoreCase("R")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs. Rock. It's a tie");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors. Player 1 wins");
                } else {
                    System.out.println("Paper covers Rock. Player 2 wins");
                }
            } else if (player1.equalsIgnoreCase("S")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player 1 wins");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs. Scissors. It's a tie");
                } else {
                    System.out.println("Scissors cuts paper. Player 2 wins");
                }
            } else {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player 1 wins");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts Paper. Player 2 wins");
                } else {
                    System.out.println("Paper vs. Paper. It's a tie");
                }
            }
            System.out.println("Would you like to play again [Y/N]");
            finished = in.nextLine();
            if (finished.equalsIgnoreCase("Y")) {
                done = true;
            } else if (finished.equalsIgnoreCase("N")){
                done = false;
            } else {
                System.out.println("You entered the wrong value. Enter Y or N");
                finished = in.nextLine();
                if (finished.equalsIgnoreCase("Y")) {
                    done = true;
                } else if (finished.equalsIgnoreCase("N")) {
                    done = false;
                } else {
                    System.out.println("You entered the wrong value. Enter Y or N");
                    finished = in.nextLine();
                    if (finished.equalsIgnoreCase("Y")) {
                        done = true;
                    } else if (finished.equalsIgnoreCase("N")) {
                        done = false;
                    } else {
                        System.out.println("You entered the wrong value. Enter Y or N");
                        finished = in.nextLine();
                        if (finished.equalsIgnoreCase("Y")) {
                            done = true;
                        } else if (finished.equalsIgnoreCase("N")) {
                            done = false;
                        } else {
                            System.out.println("You entered the wrong value. Enter Y or N");
                            finished = in.nextLine();
                            if (finished.equalsIgnoreCase("Y")) {
                                done = true;
                            } else if (finished.equalsIgnoreCase("N")){
                                done = false;
                            } else {
                                System.out.println("You entered the wrong value. Enter Y or N");
                                finished = in.nextLine();
                                if (finished.equalsIgnoreCase("Y")) {
                                    done = true;
                                } else if (finished.equalsIgnoreCase("N")) {
                                    done = false;
                                } else {
                                    System.out.println("You entered the wrong value. Enter Y or N");
                                    finished = in.nextLine();
                                    if (finished.equalsIgnoreCase("Y")) {
                                        done = true;
                                    } else if (finished.equalsIgnoreCase("N")) {
                                        done = false;
                                    } else {
                                        System.out.println("You entered the wrong value. Enter Y or N");
                                        finished = in.nextLine();
                                        if (finished.equalsIgnoreCase("Y")) {
                                            done = true;
                                        } else if (finished.equalsIgnoreCase("N")) {
                                            done = false;
                                        } else {
                                            System.out.println("You entered the wrong value. Enter Y or N");
                                            finished = in.nextLine();
                                            if (finished.equalsIgnoreCase("Y")) {
                                                done = true;
                                            } else if (finished.equalsIgnoreCase("N")){
                                                done = false;
                                            } else {
                                                System.out.println("You entered the wrong value. Enter Y or N");
                                                finished = in.nextLine();
                                                if (finished.equalsIgnoreCase("Y")) {
                                                    done = true;
                                                } else if (finished.equalsIgnoreCase("N")) {
                                                    done = false;
                                                } else {
                                                    System.out.println("You entered the wrong value. Enter Y or N");
                                                    finished = in.nextLine();
                                                    if (finished.equalsIgnoreCase("Y")) {
                                                        done = true;
                                                    } else if (finished.equalsIgnoreCase("N")) {
                                                        done = false;
                                                    } else {
                                                        System.out.println("You entered the wrong value. Enter Y or N");
                                                        finished = in.nextLine();
                                                        if (finished.equalsIgnoreCase("Y")) {
                                                            done = true;
                                                        } else if (finished.equalsIgnoreCase("N")) {
                                                            done = false;
                                                        } else {
                                                            System.out.println("You entered the wrong value. Enter Y or N");
                                                            finished = in.nextLine();

                                                        }
                                                    }
                                                }
                                            }
                                            if (finished.equalsIgnoreCase("Y")) {
                                                done = true;
                                            } else if (finished.equalsIgnoreCase("N")){
                                                done = false;
                                            } else {
                                                System.out.println("You entered the wrong value. Enter Y or N");
                                                finished = in.nextLine();
                                                if (finished.equalsIgnoreCase("Y")) {
                                                    done = true;
                                                } else if (finished.equalsIgnoreCase("N")) {
                                                    done = false;
                                                } else {
                                                    System.out.println("You entered the wrong value. Enter Y or N");
                                                    finished = in.nextLine();
                                                    if (finished.equalsIgnoreCase("Y")) {
                                                        done = true;
                                                    } else if (finished.equalsIgnoreCase("N")) {
                                                        done = false;
                                                    } else {
                                                        System.out.println("You entered the wrong value. Enter Y or N");
                                                        finished = in.nextLine();
                                                        if (finished.equalsIgnoreCase("Y")) {
                                                            done = true;
                                                        } else if (finished.equalsIgnoreCase("N")) {
                                                            done = false;
                                                        } else {
                                                            System.out.println("You entered the wrong value. Enter Y or N");
                                                            finished = in.nextLine();

                                                        }
                                                    }
                                                }
                                            }
                                            if (finished.equalsIgnoreCase("Y")) {
                                                done = true;
                                            } else if (finished.equalsIgnoreCase("N")){
                                                done = false;
                                            } else {
                                                System.out.println("You entered the wrong value. Enter Y or N");
                                                finished = in.nextLine();
                                                if (finished.equalsIgnoreCase("Y")) {
                                                    done = true;
                                                } else if (finished.equalsIgnoreCase("N")) {
                                                    done = false;
                                                } else {
                                                    System.out.println("You entered the wrong value. Enter Y or N");
                                                    finished = in.nextLine();
                                                    if (finished.equalsIgnoreCase("Y")) {
                                                        done = true;
                                                    } else if (finished.equalsIgnoreCase("N")) {
                                                        done = false;
                                                    } else {
                                                        System.out.println("You entered the wrong value. Enter Y or N");
                                                        finished = in.nextLine();
                                                        if (finished.equalsIgnoreCase("Y")) {
                                                            done = true;
                                                        } else if (finished.equalsIgnoreCase("N")) {
                                                            done = false;
                                                        } else {
                                                            System.out.println("You entered the wrong value. Enter Y or N");
                                                            finished = in.nextLine();

                                                        }
                                                    }
                                                }
                                            }
                                            if (finished.equalsIgnoreCase("Y")) {
                                                done = true;
                                            } else if (finished.equalsIgnoreCase("N")){
                                                done = false;
                                            } else {
                                                System.out.println("You entered the wrong value. Enter Y or N");
                                                finished = in.nextLine();
                                                if (finished.equalsIgnoreCase("Y")) {
                                                    done = true;
                                                } else if (finished.equalsIgnoreCase("N")) {
                                                    done = false;
                                                } else {
                                                    System.out.println("You entered the wrong value. Enter Y or N");
                                                    finished = in.nextLine();
                                                    if (finished.equalsIgnoreCase("Y")) {
                                                        done = true;
                                                    } else if (finished.equalsIgnoreCase("N")) {
                                                        done = false;
                                                    } else {
                                                        System.out.println("You entered the wrong value. Enter Y or N");
                                                        finished = in.nextLine();
                                                        if (finished.equalsIgnoreCase("Y")) {
                                                            done = true;
                                                        } else if (finished.equalsIgnoreCase("N")) {
                                                            done = false;
                                                        } else {
                                                            System.out.println("You entered the wrong value. Enter Y or N");
                                                            finished = in.nextLine();

                                                        }
                                                    }
                                                }
                                            }
                                            if (finished.equalsIgnoreCase("Y")) {
                                                done = true;
                                            } else if (finished.equalsIgnoreCase("N")){
                                                done = false;
                                            } else {
                                                System.out.println("You entered the wrong value. Enter Y or N");
                                                finished = in.nextLine();
                                                if (finished.equalsIgnoreCase("Y")) {
                                                    done = true;
                                                } else if (finished.equalsIgnoreCase("N")) {
                                                    done = false;
                                                } else {
                                                    System.out.println("You entered the wrong value. Enter Y or N");
                                                    finished = in.nextLine();
                                                    if (finished.equalsIgnoreCase("Y")) {
                                                        done = true;
                                                    } else if (finished.equalsIgnoreCase("N")) {
                                                        done = false;
                                                    } else {
                                                        System.out.println("You entered the wrong value. Enter Y or N");
                                                        finished = in.nextLine();
                                                        if (finished.equalsIgnoreCase("Y")) {
                                                            done = true;
                                                        } else if (finished.equalsIgnoreCase("N")) {
                                                            done = false;
                                                        } else {
                                                            System.out.println("Alright! Fine! You Win! Go outside and touch grass.");
                                                            done = false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }
                }
            }
        } while(done);
    }
}