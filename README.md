
	# JavaProgramming

	A collection of small Java programs and exercises covering core Java, OOP concepts, and foundational data-structures/algorithms — a personal learning and reference repository.

	**Repository Structure**
	- **Files:** Example programs are in the repo root, e.g. [FirstProgram.java](FirstProgram.java), [AreaOfCircle.java](AreaOfCircle.java), [PrimeNum.java](PrimeNum.java), [Factorial.java](factorial.java).
	- **Purpose:** Each `.java` file demonstrates a small concept or exercise (control flow, loops, functions, classes, simple algorithms).

	**Getting Started**
	- **Prerequisites:** Install JDK 8 or newer and ensure `javac`/`java` are on your PATH.
	- **Compile a single file:**

	```powershell
	javac FirstProgram.java
	```

	- **Run a compiled class:**

	```powershell
	java FirstProgram
	```

	- **Compile all Java files in the folder:**

	```powershell
	javac *.java
	```

	Note: These commands assume classes are in the default package (no `package` declaration).

	**Coding Conventions**
	- **One public class per file:** File name should match the public class name.
	- **Class names:** Use PascalCase (e.g., `PrimeNum`).
	- **Method/variable names:** Use lowerCamelCase (e.g., `calculateArea`).
	- **Keep examples small and focused:** Each file demonstrates one concept for easy reading.

	**Topics Covered**
	- **Basics:** Hello world, input/output, arithmetic ([FirstProgram.java](FirstProgram.java), [Scanning.java](Scanning.java)).
	- **Control Flow & Loops:** `if/else`, `for`, `while`, `foreach` ([Loop.java](Loop.java), [ForEach.java](ForEach.java)).
	- **Functions & OOP:** methods, classes, basic objects ([function.java](function.java), [PrintUsingOops.java](PrintUsingOops.java)).
	- **Algorithms/Math:** prime check, factorial, binomial coefficient ([PrimeNum.java](PrimeNum.java), [factorial.java](factorial.java), [binomiaCoeffient.java](binomiaCoeffient.java)).

	**How to Contribute**
	- Add small, well-documented examples demonstrating a single idea.
	- Use descriptive filenames and include brief comments or a short header comment explaining the program's purpose.
	- Prefer plain Java (no external build tool) for simple examples; consider adding Maven/Gradle projects for larger examples.
	- Send a pull request or open an issue with suggested exercises or improvements.

	**Roadmap / Ideas**
	- Add data structure examples: linked list, stack, queue, tree traversals.
	- Add algorithms: sorting, searching, recursion patterns, dynamic programming examples.
	- Provide a `build` folder or sample `pom.xml` / `build.gradle` for project-based examples.

	**License**
	- This repository is provided under the MIT License — change or add a license file if you prefer a different license.

	**Contact / Support**
	- Open an issue or submit a pull request to discuss improvements or request examples.

	----
	Small, focused examples make learning easier — feel free to ask me to add a README section, runnable scripts, or help convert examples into Maven/Gradle projects.

    