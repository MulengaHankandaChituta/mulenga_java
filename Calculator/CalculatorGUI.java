 double result = num1 + num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(text1.getText());
                    double num2 = Double.parseDouble(text2.getText());
                    double result = num1 - num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(text1.getText());
                    double num2 = Double.parseDouble(text2.getText());
                    double result = num1 * num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(text1.getText());
                    double num2 = Double.parseDouble(text2.getText());
                    if (num2 == 0) {
                        resultLabel.setText("Cannot divide by zero!");
                    } else {
                        double result = num1 / num2;
                        resultLabel.setText("Result: " + result);
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text2.setText("");
                resultLabel.setText("Result: ");
            }
        });

        // Add everything to the frame
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(clearButton);
        frame.add(resultLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}