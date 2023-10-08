 document.addEventListener('DOMContentLoaded', function () {
    const boxTrigger = document.querySelector('.vector-Gad');
    const boxContent = document.querySelector('.recentfranstable-NtZ');
    
    let isOpen = false;
    
    boxTrigger.addEventListener('click', function () {
        if (!isOpen) {
            boxContent.style.maxHeight = boxContent.scrollHeight + 'px';
        } else {
            boxContent.style.maxHeight = '0';
        }
        isOpen = !isOpen;
    });

    const boxTrigger1 = document.querySelector('.vector-h8M');
    const boxContent1 = document.querySelector('.recentfranstable-CL1');
    
    boxTrigger1.addEventListener('click', function () {
        if (!isOpen) {
            boxContent1.style.maxHeight = boxContent.scrollHeight + 'px';
        } else {
            boxContent1.style.maxHeight = '0';
        }
        isOpen = !isOpen;
    });
});

document.addEventListener('DOMContentLoaded', function () {
    const boxTrigger = document.querySelector('.vector-nvd');
    const boxContent = document.querySelector('.recentfranstable-Wbj');
    
    let isOpen = false;
    
    boxTrigger.addEventListener('click', function () {
        if (!isOpen) {
            boxContent.style.maxHeight = boxContent.scrollHeight + 'px';
        } else {
            boxContent.style.maxHeight = '0';
        }
        isOpen = !isOpen;
    });
});
document.addEventListener('DOMContentLoaded', function() {
    const headerNavPlaceholder = document.getElementById('head');

    // Fetch and insert the header and navigation HTML
    fetch('menu.html')
        .then(response => response.text())
        .then(html => {
            headerNavPlaceholder.innerHTML = html;
        });
});





