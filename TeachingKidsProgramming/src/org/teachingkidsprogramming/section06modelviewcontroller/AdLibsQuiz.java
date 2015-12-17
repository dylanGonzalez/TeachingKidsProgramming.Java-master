package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingkidsprogramming.recipes.quizzes.graders.AdLibsQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.AdLibsQuizGrader;

public class AdLibsQuiz extends AdLibsQuizAdapter
{
  @Override
  public void question1(String letter1, String letter3)
  {
    word1 = letter1 + 'o' + letter3;
  }
  @Override
  public void question2(String letter1)
  {
    word2 = word2 + letter1;
  }
  @Override
  public void question3(String templateText, Object model)
  {
    word3 = Parser.parse(templateText, model);
  }
  @Override
  public void question4(Pieces pieces)
  {
    //  Set template4 to the template which does'g' + pieces.middle + 'e'
    template4 = "g{middle}e";
  }
  public static void main(String[] args)
  {
    new AdLibsQuizGrader().grade(new AdLibsQuiz());
  }
}
