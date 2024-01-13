document.addEventListener('DOMContentLoaded', function() {
    const upperTeethContainer = document.createElement('div');
    const lowerTeethContainer = document.createElement('div');
    upperTeethContainer.classList.add('upper-teeth');
    lowerTeethContainer.classList.add('lower-teeth');
    const teethContainer = document.getElementById('teethContainer');
  
    // Create 32 teeth divs
    for (let i = 1; i <= 36; i++) {
        if(i == 17){
            i = i + 4;
        }
      const tooth = document.createElement('div');
      tooth.classList.add('tooth');
      tooth.innerText = i;
  
      tooth.addEventListener('click', function(event) {
        // Left click: Damaged
        if (event.button === 0) {
          console.log("Gauche");
          tooth.classList.toggle('damaged');
          tooth.classList.remove('missing');
        }
      });
  
      if (i <= 16) {
        upperTeethContainer.appendChild(tooth);
      } else {
        lowerTeethContainer.appendChild(tooth);
      }
    }
  
    teethContainer.appendChild(upperTeethContainer);
    teethContainer.appendChild(lowerTeethContainer);
  
    // Gestionnaire d'événements contextmenu sur le conteneur
    teethContainer.addEventListener('contextmenu', function(event) {
      event.preventDefault();
      // Right click: Colorer en noir
      event.target.classList.toggle('missing');
      event.target.classList.remove('damaged');
    });
  });
  