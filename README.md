# user-story-project
Unit 3 project.
# Unit 2 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As an [Terraria enthusiast], <br> 
> I want to [observe the data of the ingame weapons], <br> 
> so that I can [find the best in certain categories in order to gain an advantage on it's difficulty].

## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 

Example: 

Dataset: https://docs.google.com/spreadsheets/d/1S52_kx9gkcjkJGJ50t-rD8IuJScLIvkRVwuejTyoczg/edit?usp=sharing
- **WeaponName** (String) - name of the weapon 
- **Damage** (int) - Damage of the Weapon 
- **damageType** (String) - The class of the Damage
- **useTime** (int) - The amount of time in ticks that it takes to use the weapon again 

## UML Diagram 

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get displayed on this README. 

![alt text](<Opera Snapshot_2025-11-19_235105_docs.google.com.png>) 

## Description 

In this project, we utilized 1D arrays to our user story. This being a program that can display the strongest weapon in terraria under certain categories. This is done through user input based on the category they want, and a scanner records their feedback. It uses its index effectively with the various getFile methods to browse each row, finding the best weapon in total of each array, and combining them together.

This project utilizes the userStory and Scanner class, with methods in order to provide a clean console and account for the 100+ lines in the array; it faced numerous challenges along the way in the process of programming. But, the end result displays the scanner's question, allowing the user to choose between 4 weapon categories, in which the program displays the information of the Arrays of weaponNames, damage, damageType, and the useTime. 
