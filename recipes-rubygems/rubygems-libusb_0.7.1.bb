# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: libusb"
DESCRIPTION = "LIBUSB is a Ruby binding that gives Ruby programmers access to arbitrary USB devices"
HOMEPAGE = "http://github.com/larskanis/libusb"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ffi-native \
    rubygems-mini-portile2-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d99d929025e95571d099598e9115cc41"
SRC_URI[sha256sum] = "90767fb4c1798daa05b64be717b67fc8c254cba5d484b1c54fbbf352ceb57f27"

GEM_NAME = "libusb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
    rubygems-mini-portile2 \
"

BBCLASSEXTEND = "native"
