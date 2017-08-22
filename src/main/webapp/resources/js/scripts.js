/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function convertHora() {
    hora = $("input[name='hora']").val();
    $.ajax({
        data: 'hora=' + hora,
        type: "get",
        url: "/Webservice/time",
        beforeSend: function () {
        },
        success: function (data) {
            $("#respuestaHora").html(getResponse(data));
        },
        error: function (jqXHR, textStatus, errorThrown) {
            $("#respuestaHora").html(getResponseStatus(jqXHR));
        }
    });
    return;
}

function convertMayusculas() {
    palabra = $("input[name='palabra']").val();
    $.ajax({
        data: 'palabra=' + palabra,
        type: "post",
        url: "/Webservice/word",
        beforeSend: function () {
        },
        success: function (data) {
            $("#respuestaPalabra").html(getResponse(data));
        },
        error: function (jqXHR, textStatus, errorThrown) {
            $("#respuestaPalabra").html(getResponseStatus(jqXHR));
        }
    });
    return;
}
function convertHoraRest() {
    hora = $("input[name='hora2']").val();
    $.ajax({
        data: 'hora=' + hora,
        type: "get",
        url: "/Webservice/time",
        beforeSend: function () {
        },
        success: function (data) {
            $("#respuestaHora2").html(getResponse(data));
        },
        error: function (jqXHR, textStatus, errorThrown) {
            $("#respuestaHora2").html(getResponseStatus(jqXHR));
        }
    });
    return;
}

function convertMayusculasRest() {
    palabra = $("input[name='palabra2']").val();
    $.ajax({
        data: 'palabra=' + palabra,
        type: "GET",
        url: "/Webservice/word",
        beforeSend: function () {
        },
        success: function (data) {
            $("#respuestaPalabra2").html(getResponse(data));
        },
        error: function (jqXHR, textStatus, errorThrown) {
            $("#respuestaPalabra2").html(getResponseStatus(jqXHR));
        }
    });
    return;
}

/**
 * 
 * @param {type} obj
 * @returns {String}
 */
function getResponseStatus(obj) {
    return "<spam class=\"text-danger\">Response : { \"code\":" + obj.status + ",\"description\":\"" + obj.statusText + "\"}</spam>";
}

/**
 * 
 * @param {type} str
 * @returns {String}
 */
function getResponse(str) {
    return "<spam class=\"text-success\">Response : " + str + "</spam>";
}
