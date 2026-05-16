# File Integrity Checker

This project is a Java-based software security application that verifies file integrity using SHA-256 cryptographic hashing. The system detects unauthorized file modifications by comparing the original hash value of a file with its current hash value. The project is inspired by blockchain integrity mechanisms, where cryptographic hashes are used to preserve data consistency and detect tampering.

## Features
- SHA-256 hash generation
- File registration system
- File integrity verification
- Tampering detection
- Integrity logging system
- Console-based interaction

## Technologies Used
- Java
- SHA-256 Cryptographic Hashing
- File Handling
- Hash Comparison Logic
- Security Logging

## How the System Works
1. The user registers a file.
2. The system generates a SHA-256 hash value for the file.
3. The original hash value is stored.
4. When the user checks the file again, the system generates a new hash.
5. The old and new hashes are compared.
6. If the hashes are different, the system detects file tampering.

## Security Logic
The project demonstrates the concept of file integrity verification, which is an important topic in software security. Since even a small modification changes the SHA-256 hash completely, the system can detect unauthorized modifications successfully.

## Innovation
Unlike a basic hash generator, this project also includes an integrity logging system that records verification history and security events. This creates a simple audit trail similar to real-world security monitoring systems.

## Demo Scenario
1. Register a file
2. Modify the file manually
3. Run integrity verification
4. Observe the warning message:
   "WARNING! File integrity compromised."

## Future Improvements
- JavaFX graphical user interface
- Real-time folder monitoring
- Multiple hash algorithm support
- Blockchain-style integrity records
- Cloud-based integrity verification
