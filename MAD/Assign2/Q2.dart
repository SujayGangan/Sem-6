import 'dart:io';

void main(List<String> args) {
  // 2. Write a dart program to check whether a character is a vowel or consonant.

  print("Enter the character :");
  String? nm=stdin.readLineSync()!;
  
  if(nm=='a'||nm=='e'||nm=='i'||nm=='o'||nm=='u') {
    print("$nm is Vowel");
  } else {
    stdout.write("$nm is Consonant");
  }

}
