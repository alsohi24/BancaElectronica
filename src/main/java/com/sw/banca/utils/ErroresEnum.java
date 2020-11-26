package com.sw.banca.utils;

public enum ErroresEnum {
	OK {
        @Override
        public String mensaje() {
            return Constante.OK;
        }

        @Override
        public int codigo() {
            return 8000;
        }
	},
	DATOS_REQUERIDOS_INCOMPLETOS {
        @Override
        public String mensaje() {
            return Constante.DATOS_REQUERIDOS_INCOMPLETOS;
        }

        @Override
        public int codigo() {
            return 8001;
        }
	},
	NO_DATA {
        @Override
        public String mensaje() {
            return Constante.NO_DATA;
        }

        @Override
        public int codigo() {
            return 8002;
        }
	},
	EMAIL_NO_SEND {
        @Override
        public String mensaje() {
            return Constante.EMAIL_NO_SEND;
        }

        @Override
        public int codigo() {
            return 8003;
        }
	},
	SMS_NO_SEND {
        @Override
        public String mensaje() {
            return Constante.EMAIL_NO_SEND;
        }

        @Override
        public int codigo() {
            return 8004;
        }
	},FALLO_REGISTRO {
        @Override
        public String mensaje() {
            return Constante.FALLO_REGISTRO;
        }

        @Override
        public int codigo() {
            return 8005;
        }
	},FALLO_LECTURA_OCR {
        @Override
        public String mensaje() {
            return Constante.FALLO_LECTURA_OCR;
        }

        @Override
        public int codigo() {
            return 8006;
        }
	};
    
    public abstract String mensaje();

    public abstract int codigo();
}
