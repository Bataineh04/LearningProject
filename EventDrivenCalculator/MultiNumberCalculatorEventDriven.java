package MidTerm;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MultiNumberCalculatorEventDriven{
    private static String operator = "";
    private static double operation = 0;
    private static double operationTwo = 0;
    private static double value = 0;
    private static double changeSign =0;
    private static JFrame window;
    private static JPanel mainCalculatorPanel;
    private static JLabel lineOne;
    private static JLabel lineTwo;
    private static JLabel lineThree;
    private static JLabel lineFour;
    private static JPanel convertPanel;
   
    private static JPanel PlayPanel;
    private static JPanel checkPrimePanel;
    private static JCheckBox darkMode;
    private static JTextField primeNum;
    private static JButton checkIfPrimeBox;
    private static JLabel checkIfPrimeLabel;
    private static JLabel theResult;
    private static JLabel theproblemOne;
    private static JLabel arriveTheBox;
    private static JLabel theproblemTwo;
    private static JButton combination;
    private static JLabel equality;
    private static JLabel adding;
    private static JLabel complete;
   
    
    public static void main(String[] args) {
    	
        PlayPanel = new JPanel();
        checkPrimePanel  = new JPanel();
        convertPanel  = new JPanel();
     
        mainCalculatorPanel = new JPanel();
        window = new JFrame("Calculator");
        JButton nums[] = new JButton[10];
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiplication = new JButton("*");
        JButton division = new JButton("/");
        JButton point = new JButton(".");
        JButton equal = new JButton("=");
        JButton delete = new JButton("delete");
        JButton clear = new JButton("clear");
        JTextField textfield = new JTextField();
        JButton signChange = new JButton("+/-");
        JPanel MenuPanel = new JPanel();
        primeNum = new JTextField();
       
        JButton menu = new JButton("Menu");
        JButton calculator = new JButton("Normal Calculator");
        JButton checkIfNumberIsPrime = new JButton("Check if number is prime");
      
        JButton numberSystemConverter = new JButton("number system converter");
        JButton gpaCalculator = new JButton("GPA calculator");
        JButton play =new JButton("play");
       
        mainCalculatorPanel.setLayout(null);
     
       
       mainCalculatorPanel.setBounds(0, 0, window.getWidth(), window.getHeight());
        window.setSize(420, 550);
        window.setLayout(null);

    

        textfield.setBounds(45, 50, 300, 50);
        mainCalculatorPanel.add(textfield);
        MenuPanel.setLayout(null);
        for (int i = 0; i < 10; i++) {
            nums[i] = new JButton(Integer.toString(i));
            mainCalculatorPanel.add(nums[i]);
        }
        
        nums[0].setBounds(120, 360, 70, 70);
        nums[1].setBounds(40, 280, 70, 70);
        nums[2].setBounds(120, 280, 70, 70);
        nums[3].setBounds(200, 280, 70, 70);
        nums[4].setBounds(40, 200, 70, 70);
        nums[5].setBounds(120, 200, 70, 70);
        nums[6].setBounds(200, 200, 70, 70);
        nums[7].setBounds(40, 120, 70, 70);
        nums[8].setBounds(120, 120, 70, 70);
        nums[9].setBounds(200, 120, 70, 70);
        plus.setBounds(280, 120, 70, 70);
        minus.setBounds(280, 200, 70, 70);
        multiplication.setBounds(280, 280, 70, 70);
        division.setBounds(280, 360, 70, 70);
        point.setBounds(40, 360, 70, 70);
        equal.setBounds(200, 360, 70, 70);
        delete.setBounds(120, 450, 110, 50);
        clear.setBounds(240, 450, 110, 50);
        signChange.setBounds(40, 450, 70, 50);
        menu.setBounds(20, 10, 110, 30);
        calculator.setBounds(100, 20, 180, 50);
   
        numberSystemConverter.setBounds(100,80, 180, 50);
        checkIfNumberIsPrime.setBounds(100, 140,180, 50);
       
        play.setBounds(100, 200, 180, 50);
       
        MenuPanel.setBounds(0 , 0, window.getWidth(), window.getHeight());
        PlayPanel.setBounds(0, 0, window.getWidth(), window.getHeight());
      
        convertPanel.setBounds(0, 0, window.getWidth(), window.getHeight());
        checkPrimePanel.setBounds(0, 0, window.getWidth(), window.getHeight());

        
        for (int j = 0; j < 10; j++) {
            int index = j;
            nums[j].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textfield.setText(textfield.getText() + index);
                }
            });
        }
       
        darkMode = new JCheckBox("dark mode");
        darkMode.setBounds(300, 10, 100, 25);
        mainCalculatorPanel.add(darkMode);
        
        
        
        darkMode.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(darkMode.isSelected()== true)
				{
			mainCalculatorPanel.setBackground(Color.black);	
			convertPanel.setBackground(Color.black);	
			checkPrimePanel.setBackground(Color.black);	
			MenuPanel.setBackground(Color.black);	
			PlayPanel.setBackground(Color.black);
			

			}
				else
				{
					mainCalculatorPanel.setBackground(Color.white);
					convertPanel.setBackground(Color.white);	
					checkPrimePanel.setBackground(Color.white);	
					PlayPanel.setBackground(Color.white);
					MenuPanel.setBackground(Color.white);
				}
			}
		});
       
        
        
        
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText("");
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = textfield.getText();
                if (currentText.length() > 0) {
                    textfield.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        });
      
        
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
               
                operation =Double.parseDouble(textfield.getText());
                textfield.setText("");
                operator ="+";
                plus.setEnabled(false);
                minus.setEnabled(false);
                multiplication.setEnabled(false);
                division.setEnabled(false);
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	operation =Double.parseDouble(textfield.getText());
                textfield.setText("");
                operator ="-";
                plus.setEnabled(false);
                minus.setEnabled(false);
                multiplication.setEnabled(false);
                division.setEnabled(false);
                
            }
        });

        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	operation =Double.parseDouble(textfield.getText());
                textfield.setText("");
                operator ="*";
                plus.setEnabled(false);
                minus.setEnabled(false);
                multiplication.setEnabled(false);
                division.setEnabled(false);
                
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	operation =Double.parseDouble(textfield.getText());
                textfield.setText("");
                operator ="/";
                plus.setEnabled(false);
                minus.setEnabled(false);
                multiplication.setEnabled(false);
                division.setEnabled(false);
            }
        });

       
        menu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				window.setContentPane(MenuPanel);
				MenuPanel.add(darkMode);
				
				
		     

			}
		});
        
        
        window.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				System.out.println(" x="+ x +"y =" + y);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
        
        equal.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				int xa = e.getXOnScreen();
				int ya = e.getYOnScreen();
				equal.setBounds(xa, ya-50, 70, 70);
			}
		});
        
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText() + ".");
            }
        });
        
        signChange.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				changeSign =Double.parseDouble(textfield.getText());
				textfield.setText(Double.toString(changeSign*(-1)));
			}
		});
        
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationTwo = Double.parseDouble(textfield.getText());
                switch (operator) {
                    case "+":
                        value = operation + operationTwo;
                        
                        break;
                    case "-":
                        value = operation - operationTwo;
                        break;
                    case "*":
                        value = operation * operationTwo;
                        break;
                    case "/":
                        if (operationTwo != 0) {
                            value = operation / operationTwo;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid operation: Division by zero");
                            // You can handle the error condition as per your requirement
                        }
                        break;
                }
           
                textfield.setText(Double.toString(value));
                plus.setEnabled(true);
                minus.setEnabled(true);
                multiplication.setEnabled(true);
                division.setEnabled(true);
            }
        });

        


        
        
        calculator.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    mainCalculatorPanel.add(menu);
			    mainCalculatorPanel.add(darkMode);
			 window.setContentPane(mainCalculatorPanel);
		
			 
			 
		     
			}
		});
        
        checkIfNumberIsPrime.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
			window.setContentPane(checkPrimePanel);
			 checkPrimePanel.add(menu);
			 checkPrimePanel.add(darkMode);
			 menu.setBounds(20, 10, 110, 30);
			checkPrimePanel.setLayout(null);
			 primeNum.setBounds(45, 50, 300, 50);
			   checkIfPrimeBox = new JButton("check if the number is prime");
		        checkIfPrimeLabel = new JLabel();
		        checkIfPrimeBox.setBounds(95, 150, 200, 50);
		        checkIfPrimeLabel.setBounds(150, 110, 200, 50);
		        
		        checkIfPrimeBox.addActionListener(new ActionListener() {
		        	
		           @Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
		        	 		       
		        	   int checker = Integer.parseInt(primeNum.getText());
		               boolean flag = false;

		               if (checker > 1) 
		               {
		                   for (int i = 2; i < checker; i++) {
		                       if (checker % i == 0) {
		                           flag = true;
		                           break;
		                       }
		                   }
		               } else {
		                   flag = true;
		               }

		               if (flag == false) {
		                   checkIfPrimeLabel.setForeground(Color.green);
		                   checkIfPrimeLabel.setText("The number is prime");
		               } else {
		                   checkIfPrimeLabel.setForeground(Color.red);
		                   checkIfPrimeLabel.setText("The number is not prime");
		               }
		           }
				});
		        checkPrimePanel.add(checkIfPrimeBox);
		        checkPrimePanel.add(checkIfPrimeLabel);
		        
			}
		});
        numberSystemConverter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				convertPanel.add(menu);
			window.setContentPane(convertPanel);
			 convertPanel.setLayout(null);
		    JTextField textFieldToBinary = new JTextField();
		  
		    
		    menu.setBounds(20, 10, 110, 30);
		    JLabel resultOfConvert = new JLabel();
		    resultOfConvert.setForeground(Color.red);
		    JButton toBinary = new JButton("binary");
		  
		    JButton toHexaDecimal = new JButton("hexadecimal");
		    JButton toOctal = new JButton("octal");
		    
		    toBinary.setBounds(70,180 ,120 ,70);
		    toHexaDecimal.setBounds(140,260 ,120 ,70);
		    toOctal.setBounds(210 ,180 , 120, 70);
		   
		  
		    toBinary.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				int numYouWantToConvert = Integer.parseInt(textFieldToBinary.getText());
					String num = Integer.toBinaryString(numYouWantToConvert);
					resultOfConvert.setText(num);
					
				}
				
			});
		    toOctal.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int numYouWantToConvert = Integer.parseInt(textFieldToBinary.getText());
					String num = Integer.toOctalString(numYouWantToConvert);
					resultOfConvert.setText(num);
				}
			});
		    toHexaDecimal.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int numYouWantToConvert = Integer.parseInt(textFieldToBinary.getText());
					String num = Integer.toHexString(numYouWantToConvert);
					resultOfConvert.setText(num);
					
				}
			});
		   
		    resultOfConvert.setBounds(170, 130, 300, 40);
		    textFieldToBinary.setBounds(45, 50, 300, 50);
		    convertPanel.add(textFieldToBinary);
		    convertPanel.add(resultOfConvert);
		   
		    convertPanel.add(toHexaDecimal);
		    convertPanel.add(toOctal);
		    convertPanel.add(toBinary);
		    convertPanel.add(darkMode);
		
			}
		});
       
        play.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PlayPanel.add(menu);
				
				
				window.setContentPane(PlayPanel);
				PlayPanel.setLayout(null);
				PlayPanel.setBackground(Color.black);
				menu.setBounds(20, 10, 110, 30);
				theResult = new JLabel();
				theResult.setOpaque(true);
				theResult.setBackground(Color.orange); // Set the background color of the label
				theResult.setBounds(350, 450, 50, 50);
				equality = new JLabel("=");
				PlayPanel.add(theResult);
				
				theproblemOne = new JLabel();
				adding= new JLabel("+");
				theproblemOne.setOpaque(true);
				theproblemOne.setBackground(Color.red);
				theproblemOne.setBounds(30, 70, 50, 50);
				theproblemTwo = new JLabel();
				theproblemTwo.setOpaque(true);
				theproblemTwo.setBackground(Color.blue);
				adding.setBounds(90, 70, 50, 50);
				theproblemTwo.setBounds(110, 70, 50, 50);
				equality.setBounds(170,70 , 50, 50);
				combination = new JButton("drop here");
				combination.setBounds(190, 70, 100, 50);
				arriveTheBox = new JLabel("You must connect the orange square with the equation use:w,a,s,d ");
				theResult.setFocusable(true);
				PlayPanel.setFocusable(true); // Set the PlayPanel to be focusable
				theResult.setFocusable(true);
				arriveTheBox.setBounds(0, 30, 500, 50);
				complete = new JLabel("complete the combination");
			
				complete.setBounds(200, 460, 150, 50);
				lineOne = new JLabel();
				lineTwo = new JLabel();
				lineThree = new JLabel();
				lineFour = new JLabel();
				lineOne.setOpaque(true);
				lineTwo.setOpaque(true);
				lineThree.setOpaque(true);
				lineFour.setOpaque(true);
				lineOne.setBackground(Color.cyan);
				lineTwo.setBackground(Color.PINK);
				lineThree.setBackground(Color.MAGENTA);
				lineFour.setBackground(Color.green);
				lineOne.setBounds(80, 420, 420, 20);
				lineTwo.setBounds(-80, 340, 420, 20);
				lineThree.setBounds(80, 260, 420, 20);
				lineFour.setBounds(-80, 180, 420, 20);
				complete.setForeground(Color.white);
				arriveTheBox.setForeground(Color.red);
				equality.setForeground(Color.red);
				adding.setForeground(Color.red);
				combination.setForeground(Color.red);
				// Define key bindings
				theResult.setFocusable(true);
				theResult.requestFocusInWindow();
				
				darkMode.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						PlayPanel.isRequestFocusEnabled();
					}
				});

				theResult.addKeyListener(new KeyListener() {
				    @Override
				    public void keyPressed(KeyEvent e) {
				    	boolean reset = false;
				        int keyCode = e.getKeyCode();
				        int movingStep = 5;

				        int xAxis= theResult.getX();
				        int yAxis = theResult.getY();

				        switch (keyCode) {
				            case KeyEvent.VK_A:
				                xAxis = xAxis - movingStep;
				                ;
				                break;
				            case KeyEvent.VK_W:
				                yAxis = yAxis - movingStep;
				                break;
				            case KeyEvent.VK_S:
				                yAxis = yAxis + movingStep;
				                break;
				            case KeyEvent.VK_D:
				                xAxis = xAxis + movingStep;
				                break;
				        }

				        if (xAxis >= lineOne.getX() && xAxis <= lineOne.getX() + lineOne.getWidth() &&
				                yAxis >= lineOne.getY() && yAxis <= lineOne.getY() + lineOne.getHeight()) {
				            reset = true;
				        }

				        // Check collision with lineTwo
				        if (xAxis >= lineTwo.getX() && xAxis <= lineTwo.getX() + lineTwo.getWidth() &&
				                yAxis >= lineTwo.getY() && yAxis <= lineTwo.getY() + lineTwo.getHeight()) {
				            reset = true;
				        }

				        // Check collision with lineThree
				        if (xAxis >= lineThree.getX() && xAxis <= lineThree.getX() + lineThree.getWidth() &&
				                yAxis >= lineThree.getY() && yAxis <= lineThree.getY() + lineThree.getHeight()) {
				            reset = true;
				        }

				        // Check collision with lineFour
				        if (xAxis >= lineFour.getX() && xAxis <= lineFour.getX() + lineFour.getWidth() &&
				                yAxis >= lineFour.getY() && yAxis <= lineFour.getY() + lineFour.getHeight()) {
				            reset = true;
				        }
				        if(reset == true)
				        {
				        	 xAxis = 350;
				             yAxis = 450;
				        }
				        int combinationX = combination.getX();
				        int combinationY = combination.getY();
				        int combinationWidth = combination.getWidth();
				        int combinationHeight = combination.getHeight();

				        int resultX = theResult.getX();
				        int resultY = theResult.getY();
				        int resultWidth = theResult.getWidth();
				        int resultHeight = theResult.getHeight();

				        if (resultX >= combinationX && resultX + resultWidth <= combinationX + combinationWidth &&
				                resultY >= combinationY && resultY + resultHeight <= combinationY + combinationHeight) {
				            // Display a win message
				            JOptionPane.showMessageDialog(window, "Congratulations! You won!");
				        }
				        theResult.setLocation(xAxis, yAxis);
				    }

				    @Override
				    public void keyTyped(KeyEvent e) {
				        // Not used in this case
				    }

				    @Override
				    public void keyReleased(KeyEvent e) {
				        // Not used in this case
				    }
				    
				});
				
				
				PlayPanel.add(lineFour);
				PlayPanel.add(lineThree);
				PlayPanel.add(lineTwo);
				PlayPanel.add(lineOne);
				PlayPanel.add(complete);
				PlayPanel.add(combination);
				PlayPanel.add(equality);
				PlayPanel.add(theproblemOne);
				PlayPanel.add(theproblemTwo);
				PlayPanel.add(adding);
				PlayPanel.add(arriveTheBox);
				 
			       
			}
		});
        
        
        
     	
        
        mainCalculatorPanel.add(equal);
        mainCalculatorPanel.add(point);
        mainCalculatorPanel.add(division);
        mainCalculatorPanel.add(multiplication);
        mainCalculatorPanel.add(minus);
        mainCalculatorPanel.add(plus);
        mainCalculatorPanel.add(clear);
        mainCalculatorPanel.add(delete);
        mainCalculatorPanel.add(signChange);
       
        mainCalculatorPanel.add(menu);
       
        window.setFocusable(true);
        window.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}

            public void keyReleased(KeyEvent e) {}

            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                
                // Number keys
                if (key >= KeyEvent.VK_NUMPAD0 && key <= KeyEvent.VK_NUMPAD9) {
                    int num = key - KeyEvent.VK_NUMPAD0;
                    textfield.setText(textfield.getText() + num);
                } else if (key >= KeyEvent.VK_0 && key <= KeyEvent.VK_9) {
                    int num = key - KeyEvent.VK_0;
                    textfield.setText(textfield.getText() + num);
                }
                
                // Operator keys
                if (key == KeyEvent.VK_ADD || key == KeyEvent.VK_PLUS) {
                    operation = Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operator = "+";
                    plus.setEnabled(false);
                    minus.setEnabled(false);
                    multiplication.setEnabled(false);
                    division.setEnabled(false);
                } else if (key == KeyEvent.VK_SUBTRACT || key == KeyEvent.VK_MINUS) {
                    operation = Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operator = "-";
                    plus.setEnabled(false);
                    minus.setEnabled(false);
                    multiplication.setEnabled(false);
                    division.setEnabled(false);
                } else if (key == KeyEvent.VK_MULTIPLY || key == KeyEvent.VK_ASTERISK) {
                    operation = Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operator = "*";
                    plus.setEnabled(false);
                    minus.setEnabled(false);
                    multiplication.setEnabled(false);
                    division.setEnabled(false);
                } else if (key == KeyEvent.VK_DIVIDE || key == KeyEvent.VK_SLASH) {
                    operation = Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operator = "/";
                    plus.setEnabled(false);
                    minus.setEnabled(false);
                    multiplication.setEnabled(false);
                    division.setEnabled(false);
                }
                
                // Other keys
                if (key == KeyEvent.VK_ENTER) {
                    operationTwo = Double.parseDouble(textfield.getText());
                    calculateResult();
                    plus.setEnabled(true);
                    minus.setEnabled(true);
                    multiplication.setEnabled(true);
                    division.setEnabled(true);
                } else if (key == KeyEvent.VK_PERIOD || key == KeyEvent.VK_DECIMAL) {
                    textfield.setText(textfield.getText() + ".");
                } else if (key == KeyEvent.VK_BACK_SPACE) {
                    String currentText = textfield.getText();
                    if (currentText.length() > 0) {
                        textfield.setText(currentText.substring(0, currentText.length() - 1));
                    }
                } else if (key == KeyEvent.VK_BACK_SLASH) {
                    String currentText = textfield.getText();
                    double num = Double.parseDouble(currentText);
                    num = num * (-1);
                    textfield.setText(Double.toString(num));
                }
            }
            
            // Method to calculate the result
            private void calculateResult() {
                switch (operator) {
                    case "+":
                        value = operation + operationTwo;
                        break;
                    case "-":
                        value = operation - operationTwo;
                        break;
                    case "*":
                        value = operation * operationTwo;
                        break;
                    case "/":
                        if (operationTwo != 0) {
                            value = operation / operationTwo;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid operation: Division by zero");
                            // You can handle the error condition as per your requirement
                        }
                        break;
                }
                textfield.setText(Double.toString(value));
            }
        });
        

        /////////////////////////////
      
      
        MenuPanel.add(numberSystemConverter);
        MenuPanel.add(checkIfNumberIsPrime);
        MenuPanel.add(calculator);
        MenuPanel.add(play);
        mainCalculatorPanel.add(menu);
        checkPrimePanel.add(primeNum);
        
        window.setContentPane(mainCalculatorPanel);
    
        window.setVisible(true);
    }
    
    
}
