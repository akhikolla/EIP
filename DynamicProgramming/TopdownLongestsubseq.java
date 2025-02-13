class longestCommonsubsequence{
  public int longestCommonsubsequenceLength(String s1, String s2) {
    if (s1.length() == 0 || s2.length() == 0) {
      return 0;
    }
    String s1WithoutFinalCharacter = s1.substring(0, s1.length() - 1);
    String s2WithoutFinalCharacter = s2.substring(0, s2.length() - 1);
    char s1FinalCharacter = s1.charAt(s1.length() - 1);
    char s2FinalCharacter = s2.charAt(s2.length() - 1);

    if (s1FinalCharacter == s2FinalCharacter) {
      return 1 + longestCommonsubsequenceLength(s1WithoutFinalCharacter, s2WithoutFinalCharacter);
    } else {
      return Math.max(longestCommonsubsequenceLength(s1, s2WithoutFinalCharacter),
          longestCommonsubsequenceLength(s1WithoutFinalCharacter, s2));
    }
  }
}