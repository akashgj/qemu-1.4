require qemu-dm.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/qemu-dm-1.4.0:"

SRC_URI[tarball.md5sum] = "78f13b774814b6b7ebcaf4f9b9204318"
SRC_URI[tarball.sha256sum] = "066297ed77408fb7588889c271a85cf3c259ad55c939315988e6062d7708eda8"

EXTRA_OECONF += "--enable-debug --disable-strip --audio-drv-list=xen_alsa"

do_install_append(){
    install -m 0755 -d ${D}${sysconfdir}/qemu
    install -m 0755 ${WORKDIR}/qemu-ifup-stubdom ${D}${sysconfdir}/qemu/qemu-ifup
}

SRC_URI += "file://qemu-ifup-stubdom"
SRC_URI += "file://0001-static-fix.patch;striplevel=1"
SRC_URI += "file://0002-ioreq-server-upstream.patch;striplevel=2"
SRC_URI += "file://0003-ioreq-server.patch;striplevel=2"
SRC_URI += "file://0004-logging-syslog.patch;striplevel=2"
SRC_URI += "file://0005-bridge-helper-syslog.patch;striplevel=2"
SRC_URI += "file://0006-dmbus.patch;striplevel=2"
SRC_URI += "file://0007-pci-reserve-igd-slot.patch;striplevel=2"
SRC_URI += "file://0008-switcher.patch;striplevel=2"
SRC_URI += "file://0009-acpi.patch;striplevel=2"
SRC_URI += "file://0010-xc-emulated-nic-link-state-propagation.patch;striplevel=2"
SRC_URI += "file://0011-battery.patch;striplevel=2"
SRC_URI += "file://0012-audio-alsa.patch;striplevel=2"
SRC_URI += "file://0013-xenmou.patch;striplevel=2"
SRC_URI += "file://0014-audio-alsa-stub.patch;striplevel=2"
SRC_URI += "file://0015-atapi-pass-through.patch;striplevel=2"
SRC_URI += "file://0016-vbe-xt-extensions.patch;striplevel=2"
SRC_URI += "file://0017-vga-spinlock.patch;striplevel=2"
SRC_URI += "file://0018-vga-shadow-bda.patch;striplevel=2"
SRC_URI += "file://0019-surfman-dcl.patch;striplevel=2"
SRC_URI += "file://0020-audio-policy.patch;striplevel=2"
SRC_URI += "file://0021-fix-surfman-coherency.patch;striplevel=2"
SRC_URI += "file://0022-change-default-pixelformat.patch;striplevel=2"
