KV = "3.14-1.17"
DRIVERDATE = "20190312"

require dreambox-dvb-modules-new.inc

SRC_URI[dm900.md5sum] = "43762d4946b0f17a6500f8f241aae0a2"
SRC_URI[dm900.sha256sum] = "0308dedf0c62a1a97c3339a763dd6a9a69b62050948e21df77b79991429ebc98"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
