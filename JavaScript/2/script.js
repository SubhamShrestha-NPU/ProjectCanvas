function stop() {
  document.getElementById('red').style.background = 'hsl(0, 100%, 50%)';
  document.getElementById('green').style.background = 'hsl(120, 96%, 25%)';
  document.getElementById('yellow').style.background = 'hsl(60, 97%, 25%)';
}
function go() {
  document.getElementById('red').style.background = 'hsl(0, 100%, 25%)';
  document.getElementById('green').style.background = 'hsl(120, 96%, 50%)';
  document.getElementById('yellow').style.background = 'hsl(60, 97%, 25%)';
}
function caution() {
  document.getElementById('red').style.background = 'hsl(0, 100%, 25%)';
  document.getElementById('green').style.background = 'hsl(120, 96%, 25%)';
  document.getElementById('yellow').style.background = 'hsl(60, 97%, 50%)';
}