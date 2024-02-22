import 'dart:io';

void main(List<String> args) {
  // 2. Write a program in Dart to reverse a String using function

  stdout.write("Enter the string to reverse : ");
  String string = stdin.readLineSync()!;
  stdout.write("Reversed string is : ${reverseString(string)}");
}

String reverseString(String string) {
  String reversedString = string.split('').reversed.join();
  return reversedString;
}
