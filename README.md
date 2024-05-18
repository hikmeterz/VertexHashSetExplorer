# VertexHashSetExplorer
This repository features a custom implementation of a hash set in Java designed to manage complex data represented as vertices. The project showcases a detailed method to handle collisions, print data structures, and map vertex entries to specific hash table indices.

# Components
HashSet.java: Implements a custom hash set that stores Vertex objects in an array of ArrayLists. It includes methods for inserting vertices, compressing hash codes, printing the contents of the hash set, and retrieving original array data based on indices stored in a list of Pair objects.

Vertex.java: Represents a vertex with three-dimensional coordinates (x, y, z). Includes methods to determine equality based on coordinates and to output vertex data as a string.

Pair.java: A utility class representing a pair of integers. Used in HashSet to store the row and column indices of vertices in the hash table.

Main.java: The entry point of the application, which reads vertex data from a file, inserts it into the hash set, and invokes various print and retrieval methods to demonstrate the hash set's functionality.

# Features
Custom Hash Set Implementation: Manages collisions and maintains an efficient mapping of vertex data to indices.

Collision Handling: Demonstrates a unique approach to handle collisions by storing vertex data only if it's not already present.

Data Retrieval: Offers methods to retrieve original vertex data and their respective indices in a formatted manner.
