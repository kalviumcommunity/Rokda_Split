#!/bin/bash

# Define the project directory
project_dir="."

# Create the main project directory
mkdir -p "$project_dir/src/main/java"
mkdir -p "$project_dir/src/test"
mkdir -p "$project_dir/lib"
mkdir -p "$project_dir/bin"
mkdir -p "$project_dir/data"
mkdir -p "$project_dir/docs"
mkdir -p "$project_dir/config"
mkdir -p "$project_dir/build"

# Create .gitkeep file to keep the directories in Git
touch "$project_dir/src/test/.gitkeep"
touch "$project_dir/lib/.gitkeep"
touch "$project_dir/bin/.gitkeep"
touch "$project_dir/data/.gitkeep"
touch "$project_dir/docs/.gitkeep"
touch "$project_dir/config/.gitkeep"
touch "$project_dir/build/.gitkeep"

# Create sample Java source files
touch "$project_dir/src/main/java/User.java"
touch "$project_dir/src/main/java/Expense.java"
touch "$project_dir/src/main/java/Group.java"
touch "$project_dir/src/main/java/Payment.java"
touch "$project_dir/src/main/java/Rokda_Split.java"

# Make the script executable
chmod +x "$project_dir/src/main/java/Rokda_Split.java"

echo "Project structure created successfully in '$project_dir'."

# Optionally, you can provide additional instructions or actions here.
