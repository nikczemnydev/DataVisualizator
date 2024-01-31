DataVisualizator - a play on Polish word for visualizer - wizualizator, is a Java-based data visualization program that allows users to create pie charts and bar charts from their data. The program is designed to be as user-friendly and intuitive as possible (given it's a command line tool), with a simple text interface that guides users through the process of creating their own custom charts in 2 easy steps.

To use the program, users simply enter their data in the form of a phrase that includes the name of the field followed by a space and then the corresponding percentage of the graph as a number. These elements are separated by semicolons. The program then prompts the user to select the type of graph they want to create, with two options currently available: pie chart and bar chart. Once the user has made their selection, the program generates the chosen graph and presents the data in an easy-to-read format.

It's got simple data visualization capabilities, hence this product is perfect for anyone looking to create custom charts and graphs quickly and easily. Whether you’re a data analyst, a business owner, or just someone who wants to visualize their data in a more meaningful way, this program is the perfect tool for the simple jobs.

# INSTRUCTIONS FOR WINDOWS #
1. (Optional - if you want to be able to run the program from the command line) Download and install JDK. (link: https://www.oracle.com/java/technologies/downloads/#jdk21-windows).
2. Download JFreeChart library in .jar format (link: https://www.jfree.org/jfreechart/download.html).
3. Either download DataVisualizator.java from the /src folder, or just copy the code.
4. If you copied the code - create a new project in your IDE of choice (I use IntelliJ, but also test in Eclipse), name it DataVisualizator, and paste the code into the main class. If you downloaded the java file, create a new project from existing sources and choose the java file.
5. Go to project structure -> modules -> dependencies, and import JFreeChart Library (.jar file option).
   ![image](https://github.com/nikczemnydev/DataVisualizator/assets/136376818/7d968316-def5-4ec0-8bd9-b0747c935e88)
6. Run the program and follow the instructions. I know I only covered how to run it from your IDE - there are ways to run java code requiring external libraries from command line, but instructions are a bit different for every operating system, and there is plenty of description on how to do that online.

   And this is what it looks like, you can see the input I used together with the chart choice in the console(for anybody interested, the chart used in the example represents top 10 air polluting countries by their percentage in global emissions):
   ![Screenshot 2024-01-31 165409](https://github.com/nikczemnydev/DataVisualizator/assets/136376818/0424662f-5b55-471c-b0ce-89b338e60637)
