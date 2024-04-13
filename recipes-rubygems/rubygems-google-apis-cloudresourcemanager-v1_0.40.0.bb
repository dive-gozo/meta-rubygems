# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-cloudresourcemanager_v1"
DESCRIPTION = "This is the simple REST client for Cloud Resource Manager API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "63a4031b928b56a730090c81944a2e00"
SRC_URI[sha256sum] = "445bab538c7b07579c33e5c61651ef7ee1ea0000894dea599e9b719030a1b134"

GEM_NAME = "google-apis-cloudresourcemanager_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"