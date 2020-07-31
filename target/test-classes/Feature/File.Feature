
Feature: file exec count
  Test python file execution and line count

  Scenario: file exec 
    Given I execute the python script "C:\Users\rupim\PycharmProjects\test\createFile.py" that creates a text file with three lines
    Then the file "C:\class0315\file1.txt" should have 3 lines of text

  