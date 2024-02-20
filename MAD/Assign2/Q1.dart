import 'dart:io';

void main(List<String> args) {
  // 1. Write a dart program to check if the number is odd or even.
  
  print("Enter a number: ");
  int? num = int.parse(stdin.readLineSync()!);
  
  if(num % 2 == 0){
    print("Number is even.\n");
  } else {
    print("Number is odd.\n");
  }

}
