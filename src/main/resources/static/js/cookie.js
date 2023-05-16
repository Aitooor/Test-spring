// Javascript to show and hide cookie banner using localstorage

// Shows the Cookie banner
function showCookieBanner() {
  const cookieBanner = document.getElementById("cb-cookie-banner");
  cookieBanner.style.display = "block";
}

// Hides the Cookie banner and saves the value to localstorage
function hideCookieBanner() {
  localStorage.setItem("cb_isCookieAccepted", "yes");
  const cookieBanner = document.getElementById("cb-cookie-banner");
  cookieBanner.style.display = "none";
}

// Checks the localstorage and shows Cookie banner based on it.
function initializeCookieBanner() {
  let isCookieAccepted = localStorage.getItem("cb_isCookieAccepted");
  if (isCookieAccepted !== "yes") {
    localStorage.setItem("cb_isCookieAccepted", "no");
    showCookieBanner();
  }
}

// Assigning values to window object
window.onload = initializeCookieBanner;
window.cb_hideCookieBanner = hideCookieBanner;
