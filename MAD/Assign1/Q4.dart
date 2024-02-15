import 'dart:io';

void main(List<String> args) {
  // 4. Write a program to print full name of a from first name and last name using user input
  print('Enter your First name: ');
  String? fName = stdin.readLineSync();
  print('Enter your Last name: ');
  String? lName = stdin.readLineSync();
  String? fullName = "${fName!} ${lName!}";
  print('Full name is: $fullName');
}
