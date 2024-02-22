import 'dart:io';

void main(List<String> args) {
  // 7. Write a function in Dart called createUser with parameters name, age, and isActive, where isActive has a default value of true.

  stdout.write("Enter the user's details : \n");
  stdout.write("Enter the name of user : ");
  String? name = stdin.readLineSync()!;

  stdout.write("Enter the age of user : ");
  int? age = int.parse(stdin.readLineSync()!);

  stdout.write("Enter whether the  user is active (true/false) : ");
  String? isActive = stdin.readLineSync()!;

  stdout.write(
      "\nUser is Active? :- ${createUser(name, age, isActive: isActive)}");
}

String createUser(String name, int age, {isActive = "true"}) {
  return isActive;
}
