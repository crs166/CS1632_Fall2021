TEST FIXTURE:
1. Firefox browser version >= 93, or Chrome browser version >= 94 is installed and launched.
2. https://cs1632.appspot.com/ is opened on the web browser by typing the URL on the address box.
3. The Rent-A-Cat system is reset by clicking on the "Reset" link (all three cats available).

TEST CASES:

```
IDENTIFIER: TEST-LINKS
TEST CASE: Check that the "Rent-A-Cat" link properly points to `/rent-a-cat`.
PRECONDITIONS: None.
EXECUTION STEPS: None.
POSTCONDITIONS: The href link of the "Rent-A-Cat" menu item points to `/rent-a-cat`.
```

```
IDENTIFIER: TEST-LISTING
TEST CASE: Check that the listing has three cats and the third is "ID 3. Mistoffelees".
PRECONDITIONS: None.
EXECUTION STEPS: None.
POSTCONDITIONS: 
1. There are exactly three items in the listing.
2. The text in the third item is "ID 3. Mistoffelees".
```

```
IDENTIFIER: TEST-CATALOG
TEST CASE: Check that the second item in the catalog is an image named "cat2.jpg".
PRECONDITIONS: None.
EXECUTION STEPS: None.
POSTCONDITIONS: The source of the second image in the catalog is "/images/cat2.jpg".
```

```
IDENTIFIER: TEST-RENT-A-CAT
TEST CASE: Check that the "Rent" and "Return" buttons exist in the Rent-A-Cat page.
PRECONDITIONS: None.
EXECUTION STEPS:
1. Press the "Rent-A-Cat" link.
POSTCONDITIONS: 
1. A "Rent" button exists on the page.
2. A "Return" button exists on the page.
```

```
IDENTIFIER: TEST-RENT
TEST CASE: Check that renting cat ID 2 works as expected.
PRECONDITIONS: None.
EXECUTION STEPS:
1. Press the "Rent-A-Cat" link.
2. Enter "2" into the input box for the rented cat ID.
3. Press the "Rent" button.
POSTCONDITIONS: 
1. The second item in the cat listing changes to "Rented out".
2. The text "Success!" appears beside the "Rent" button.
```
