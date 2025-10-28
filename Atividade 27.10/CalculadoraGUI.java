        try {
        double num1 = Double.parseDouble(jTextPaneNumero1.getText());
        double num2 = Double.parseDouble(jTextPaneNumero2.getText());
        
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(num1, num2);
        
        jTextPaneResultado.setText("Resultado: " + resultado);
        
    } catch (NumberFormatException ex){
        jTextPaneResultado.setText("Digite valores numéricos");
    } catch (ArithmeticException ex) {
        jTextPaneResultado.setText(ex.getMessage());
    }