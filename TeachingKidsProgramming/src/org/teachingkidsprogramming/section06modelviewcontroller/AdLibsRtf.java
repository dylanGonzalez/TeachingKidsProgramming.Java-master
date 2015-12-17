package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    public String adverb, verb, bodyParts;
  }
  public static void main(String[] args)
  {
    Words word = new Words();
    word.adverb = MessageBox.askForTextInput("Enter an adverb.");
    word.verb = MessageBox.askForTextInput("Enter a verb ending in -ed");
    //  Ask the user to enter a body part, save it as currentBodyPart --#4
    word.bodyParts = MessageBox.askForTextInput("");
    String currentStroy = Parser.parseRtfFile("view.rtf", word);
    Viewer.displayRtfFile(currentStroy);
  }
}