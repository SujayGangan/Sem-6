import 'dart:io';

void main(List<String> args) {
  // 3.Write a dart program to check whether a number is positive, negative, or zero.

  print("Enter any number:");
  int? x = int.parse(stdin.readLineSync()!);

  if(x>=1) {
    print("$x is Positive number");
  } else if(x<0) {
    print("$x is Negative number");
  } else {
    print("$x is Zero");
  }
  
}
