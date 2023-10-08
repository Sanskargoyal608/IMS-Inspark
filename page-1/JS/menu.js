// Get references to the target element and the other component

const targetElement = document.querySelector('.group-114-Unm'); // Use querySelector to select by class
const otherComponent = document.querySelector('.property-1variant2-tWm');

// Add event listeners for mouseenter and mouseleave
targetElement.addEventListener('mouseenter', () => {
    // Change the state or appearance of the other component on hover (e.g., add a class)
    otherComponent.classList.add('active');
});

targetElement.addEventListener('mouseleave', () => {
    // Revert the state or appearance of the other component when the mouse leaves
    otherComponent.classList.remove('active');
});

// include-header-nav.js

