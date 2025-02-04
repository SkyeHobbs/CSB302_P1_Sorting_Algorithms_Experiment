# Java Application: Sorting Algorithms Experiment
A Java program that sorts arrays, measures runtime, and exports performance data

![Java](https://img.shields.io/badge/Java-20232A?style=for-the-badge&logo=Java&logoColor=blue)![Git](https://img.shields.io/badge/git-20232A?style=for-the-badge&logo=git&logoColor=red)
![GitHub](https://img.shields.io/badge/github-20232A?style=for-the-badge&logo=github&logoColor=white)
![Junit5](https://img.shields.io/badge/Junit5-20232A?style=for-the-badge&logo=junit5&logoColor=yellow)
![JfreeChart](https://img.shields.io/badge/JfreeChart-20232A?style=for-the-badge&logo=JfreeChart&logoColor=blue)

## Project Overview
This project conducts an experimental analysis of 12 sorting algorithms, including Insertion 
Sort, Selection Sort, Bubble Sort, Shell Sort, Merge Sort, Quick Sort (First Pivot, Random Pivot, Median-of-Three Pivot), Heap Sort, Counting Sort, Bucket Sort, and Radix Sort. It evaluates their performance by sorting 70 test arrays per algorithm, with sizes ranging from 4 to 32,768 and various input configurations (random, sorted, reverse-sorted, 50% sorted, and 75% sorted). Each algorithm’s execution time is measured in microseconds, and the results are stored in CSV files for further analysis.

## Features
1. **Generate Arrays**: Creates 14 different array sizes (powers of 2 from 4 to 32,768) with random integers (0-40,000) in five variations: random, ordered, reverse-ordered, 50% ordered, and 75% ordered.
2. **Sort and Measure Performance**: Implements 12 sorting algorithms, measuring execution time in microseconds for 70 arrays per algorithm.
3. **Export Data and Visualize Results**: Stores runtime data in CSV files and generates performance charts for comparison.

## UML Diagram
![P1_UML_final.png](img%2FP1_UML_final.png)

## Installation & Setup
### Prerequisites:
* Install Java 17+

### Steps to Run:
* Clone this repository 
* Build the project

### Install JFreeCharts:

1. Download the Required JAR Files 
* Obtain the necessary JAR files from the official website or a trusted source.
* Example: Download JFreeChart from JFreeChart’s website.
* Extract the files if they are in a compressed format (e.g., .zip).

2. Add JAR Files to Your Project

    
_**In IntelliJ IDEA:**_
``` 
1. Open File > Project Structure > Modules.
2. Go to the Dependencies tab.
3. Click the ”+” button, then select “JARs or Directories”.
4. Locate and select the downloaded JAR files (e.g., jfreechart-1.0.19.jar, jcommon-1.0.23.jar).
5. Click Apply and OK to save changes.
```
_**In Eclipse:**_
    
```
1. Right-click your project in the Project Explorer.
2. Select Build Path > Configure Build Path.
3. Go to the Libraries tab and click “Add External JARs”.
4. Browse to and select the required JAR files.
5. Click Apply and Close.
```
_**In VS Code:**_

```
1. Place the JAR files inside your project’s lib/ folder.
2. Open settings.json or configure launch.json if using a build tool (e.g., Maven or Gradle).
3. If using Java Extension Pack, add classpath references manually in the .vscode/settings.json.
```

_**In NetBeans:**_
```
1. Right-click the project and select “Properties”.
2. Navigate to Libraries > Compile.
3. Click “Add JAR/Folder” and select the JAR files.
4. Click OK to apply the changes.
```

## License

This project is licensed under the MIT License.
