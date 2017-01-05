/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function convertHora() {
    hora = $("input[name='hora']").val();
    $.ajax({
        data: 'hora='+hora,
        type: "get",
        url: "/webservice/time",
        beforeSend: function () {
        },
        success: function (data) {
            $("#respuestaHora").html(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(errorThrown);
            console.log(textStatus);
            console.log(jqXHR);
        }
    });
    return;
}

function convertMayusculas() {
    palabra = $("input[name='palabra']").val();
    $.ajax({
        data: 'palabra='+palabra,
        type: "post",
        url: "/webservice/word",
        beforeSend: function () {
        },
        success: function (data) {
            $("#respuestaPalabra").html(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(errorThrown);
            console.log(textStatus);
            console.log(jqXHR);
        }
    });
    return;
}