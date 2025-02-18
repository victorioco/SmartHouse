package com.udc.muei.apm.apm_smarthouse.util;

import com.google.android.gms.maps.model.LatLng;
import com.udc.muei.apm.apm_smarthouse.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by José Manuel González on 18/04/2018 -- 17:01.
 */


public class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String NOTIFICATION_CALEFACCION_AUTO_KEY = PACKAGE_NAME + ".NOTIFICATION_CALEFACCION_AUTO_KEY";
    public static final String NOTIFICATION_LUCES_AUTO_KEY = PACKAGE_NAME + ".NOTIFICATION_LUCES_AUTO_KEY";
    public static final String NOTIFICACION_TRANSITION_KEY = PACKAGE_NAME + ".NOTIFICACION_TRANSITION_KEY";
    public static final String NOTIFICACION_TRANSITION_ACTION_KEY = PACKAGE_NAME + ".NOTIFICACION_TRANSITION_ACTION_KEY";
    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";
    public static final String BEACONS_ADDED_KEY = PACKAGE_NAME + ".BEACONS_ADDED_KEY";
    public static final String WIFI_ADDED_KEY = PACKAGE_NAME + ".WIFI_ADDED_KEY";
    public static final String RADIUS_KEY = PACKAGE_NAME + ".RADIUS_KEY";
    public static final String OPTION_AUTO_CALEFACCION_KEY = PACKAGE_NAME + ".OPTION_AUTO_CALEFACCION_KEY";
    public static final String OPTION_AUTO_LUCES_KEY = PACKAGE_NAME + ".OPTION_AUTO_LUCES_KEY";
    public static final String LOCATION_LAT_HOME_KEY = PACKAGE_NAME + ".LOCATION_LAT_HOME_KEY";
    public static final String LOCATION_LNG_HOME_KEY = PACKAGE_NAME + ".LOCATION_LNG_HOME_KEY";
    public static final String NOTIFICATION_LUCES_ID_BEACON_KEY = PACKAGE_NAME +".ID_BEACON_KEY";
    public static final String FLAG_NOTIFICATION_LIGTHS = PACKAGE_NAME +".FLAG_NOTIFICATION_LIGTHS";


    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 4600;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;

    /**
     * Minimo de radio del circulo para la calefaccion en metros
     */
    public static final float MIN_RADIUS_CALEFACCION = 50;  //50 metros

    /**
     * Máximo de radio del círculo para la calefaccion en metros
     */
    public static final float MAX_RADIUS_CALEFACCION = 10000;  // 10 Km

    public static final float DEFAULT_RADIUS_CALEFACCION = 1000;  // 1 Km

    public static final float GEOFENCE_RADIUS_IN_METERS = 1609; // 1 mile, 1.6 km

    public static final String GEOFENCE_ID_STRING = "Casa";
    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<>();

    static {
        // Casa
        BAY_AREA_LANDMARKS.put("Casa", new LatLng(43.3555288930694543, -8.408066779375076));
    }


    /**
     * Mapeo de tipos de peticiones al servidor
     */
    public static final HashMap<String, String> MAP_PETICIONES = new HashMap<>();

    static {
        /** Petición user (se obtiene ID usuario en la BD de Django y
         * más información relativa al usuario logueado)
         */
        MAP_PETICIONES.put("Login", "login/");
        /** Petición Favoritos (se obtienen aquellos dispositivos favoritos para el usuario
         * logueado)
         */
        MAP_PETICIONES.put("Favoritos", "favoritos/");

        /** Petición de los Lugares (se obtienen los lugares de la casa)
         */
        MAP_PETICIONES.put("Lugares", "lugares/");

        /** Petición de los dispositivos de un lugar
         */
        MAP_PETICIONES.put("Dispositivos", "dispositivos/");

        /** Anhadir/Eliminar dispositivo favorito
         */
        MAP_PETICIONES.put("ModificarFavorito", "modificarFavorito/");

        /** Modificar dispositivo
         */
        MAP_PETICIONES.put("ModificarDispositivo", "modificarDispositivo/");

        /** Lista de usuarios
         */
        MAP_PETICIONES.put("Usuarios", "usuarios/");

        /** Lista de permisos
         */
        MAP_PETICIONES.put("Permisos", "permisos/");

        /** Root modifica un permiso
         */
        MAP_PETICIONES.put("ModificarPermiso", "modificarPermiso/");

        /** Encender la calefacción
         */
        MAP_PETICIONES.put("EncenderCalefaccion", "encenderCalefaccion/");

        /** Obtener beacons
         */
        MAP_PETICIONES.put("ObtenerBeacons", "obtenerBeacons/");

        /** Obtener beacons
         */
        MAP_PETICIONES.put("Beacon", "beacon/");
    }


    public enum ACTIONS_NOTIFICATIONS {
        YES, NO
    }





    public static final int CALEFACCION_NOTIFICATION_ID = 1992;
    public static final int LUCES_NOTIFICATION_ID = 1994;
}