void main(List<String> args) {
  // 7. Write a program in Dart to remove all whitespaces from String
  String? name = "billy bob";
  print('string : $name');
  print('String with no whitespaces : ${name.replaceAll(" ", '')}');
}
