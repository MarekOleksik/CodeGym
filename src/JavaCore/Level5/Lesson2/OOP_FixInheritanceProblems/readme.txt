Correct the containsBones method and all associated logic so that:
1. The program's behavior remains the same.
2. The containsBones method must return an Object and the value "Yes" instead of true, and "No" instead of false

Wymagania:
•	The BodyPart class's containsBones method must return an Object.
•	The Finger class must be a descendant of the BodyPart class.
•	The Finger class's containsBones method must return an Object.
•	The BodyPart class's containsBones method should return "Yes".
•	The Finger class's containsBones method should return "Yes" if the BodyPart class's containsBones method returns "Yes" and the isArtificial flag is false. If this condition is not satisfied, then return "No".
•	The BodyPart class's toString method should return a string formatted as follows "<name> (name of the body part) contains bones" if the containsBones method returns "Yes" for the body part. If it returns "No", then the string should be formatted as "<name> (name of the body part) does not contain bones".