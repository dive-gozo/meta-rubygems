# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b6ce5c8663d0d38f12643c9bf595ec68"
SRC_URI[sha256sum] = "b6128ee241383be08876b4ea33cefd8f4563c6ebdc2672ecb5fc77ce2fb55f49"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"