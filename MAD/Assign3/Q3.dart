import 'dart:io';

void main(List<String> args) {
  // 3. Write a program in Dart to calculate power of a certain number. For e.g 5^3=125

  stdout.write("Enter the Number : ");
  int? num = int.parse(stdin.readLineSync()!);
  stdout.write("Enter the power value you want for that number : ");
  int? power = int.parse(stdin.readLineSync()!);

  stdout.write(
      "$num to the power $power is (i.e $num^$power) : ${calculatePower(num, power)}");
}

int calculatePower(int num, int power) {
  int val = 1;

  for (int i = 0; i < power; i++) {
    val = val * num;
  }

  return val;
}
