void main(List<String> args) {
  // 6. Write a program to swap two numbers.
  int num1 = 8, num2 = 12;
  print('Before swap:-  num1 = $num1 , num2 = $num2');
  int? temp;
  temp = num1;
  num1 = num2;
  num2 = temp;
  print('After swap:-   num1 = $num1 , num2 = $num2');
}
