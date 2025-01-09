# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get dab-adapter could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/dab-adapter/0.6.0"
SRC_URI += "git://github.com/device-automation-bus/dab-adapter-rs.git;protocol=https;nobranch=1;branch=v0.7.0"
SRCREV = "1c497e1c047870cc7f115fc4aceb42c1f041c609"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+1c497e1c04"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.21.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aead/0.3.2 \
    crate://crates.io/aes-gcm/0.8.0 \
    crate://crates.io/aes-soft/0.6.4 \
    crate://crates.io/aes/0.6.0 \
    crate://crates.io/aesni/0.10.0 \
    crate://crates.io/aho-corasick/0.6.10 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anyhow/1.0.81 \
    crate://crates.io/arrayvec/0.5.2 \
    crate://crates.io/async-attributes/1.1.2 \
    crate://crates.io/async-channel/1.9.0 \
    crate://crates.io/async-channel/2.2.0 \
    crate://crates.io/async-dup/1.2.4 \
    crate://crates.io/async-executor/1.8.0 \
    crate://crates.io/async-global-executor/2.4.1 \
    crate://crates.io/async-h1/2.3.4 \
    crate://crates.io/async-io/1.13.0 \
    crate://crates.io/async-io/2.3.2 \
    crate://crates.io/async-lock/2.8.0 \
    crate://crates.io/async-lock/3.3.0 \
    crate://crates.io/async-std/1.12.0 \
    crate://crates.io/async-task/4.7.0 \
    crate://crates.io/async-tls/0.10.0 \
    crate://crates.io/async-trait/0.1.77 \
    crate://crates.io/atomic-waker/1.1.2 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/0.1.8 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.69 \
    crate://crates.io/base-x/0.2.11 \
    crate://crates.io/base64/0.12.3 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.21.7 \
    crate://crates.io/bit_field/0.10.2 \
    crate://crates.io/bitflags/0.9.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.4.2 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/blocking/1.5.1 \
    crate://crates.io/bumpalo/3.15.4 \
    crate://crates.io/bytemuck/1.14.3 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/bytes/1.5.0 \
    crate://crates.io/cc/1.0.90 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.35 \
    crate://crates.io/cipher/0.2.5 \
    crate://crates.io/clap/3.2.25 \
    crate://crates.io/clap_derive/3.2.25 \
    crate://crates.io/clap_lex/0.2.4 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/cmake/0.1.50 \
    crate://crates.io/color_quant/1.1.0 \
    crate://crates.io/concurrent-queue/2.4.0 \
    crate://crates.io/config/0.10.1 \
    crate://crates.io/const_fn/0.4.9 \
    crate://crates.io/cookie/0.14.4 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/cpufeatures/0.2.12 \
    crate://crates.io/cpuid-bool/0.2.0 \
    crate://crates.io/crc32fast/1.4.0 \
    crate://crates.io/crossbeam-channel/0.5.12 \
    crate://crates.io/crossbeam-deque/0.8.5 \
    crate://crates.io/crossbeam-epoch/0.9.18 \
    crate://crates.io/crossbeam-queue/0.3.11 \
    crate://crates.io/crossbeam-utils/0.8.19 \
    crate://crates.io/crossbeam/0.8.4 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/crypto-mac/0.10.1 \
    crate://crates.io/ctr/0.6.0 \
    crate://crates.io/darling/0.20.8 \
    crate://crates.io/darling_core/0.20.8 \
    crate://crates.io/darling_macro/0.20.8 \
    crate://crates.io/dashmap/5.5.3 \
    crate://crates.io/data-encoding/2.5.0 \
    crate://crates.io/deadpool/0.7.0 \
    crate://crates.io/deranged/0.3.11 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/discard/1.0.4 \
    crate://crates.io/either/1.10.0 \
    crate://crates.io/enum-iterator-derive/0.8.1 \
    crate://crates.io/enum-iterator/0.8.1 \
    crate://crates.io/env_logger/0.4.3 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.8 \
    crate://crates.io/event-listener-strategy/0.4.0 \
    crate://crates.io/event-listener-strategy/0.5.0 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/event-listener/4.0.3 \
    crate://crates.io/event-listener/5.2.0 \
    crate://crates.io/exr/1.72.0 \
    crate://crates.io/extprim/1.7.1 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fastrand/2.0.1 \
    crate://crates.io/fdeflate/0.3.4 \
    crate://crates.io/filetime/0.2.23 \
    crate://crates.io/flate2/1.0.28 \
    crate://crates.io/flume/0.11.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/form_urlencoded/1.2.1 \
    crate://crates.io/fsevent-sys/4.1.0 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/futures-channel/0.3.30 \
    crate://crates.io/futures-core/0.3.30 \
    crate://crates.io/futures-executor/0.3.30 \
    crate://crates.io/futures-io/0.3.30 \
    crate://crates.io/futures-lite/1.13.0 \
    crate://crates.io/futures-lite/2.2.0 \
    crate://crates.io/futures-macro/0.3.30 \
    crate://crates.io/futures-sink/0.3.30 \
    crate://crates.io/futures-task/0.3.30 \
    crate://crates.io/futures-timer/3.0.3 \
    crate://crates.io/futures-util/0.3.30 \
    crate://crates.io/futures/0.3.30 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.1.16 \
    crate://crates.io/getrandom/0.2.12 \
    crate://crates.io/getset/0.1.2 \
    crate://crates.io/ghash/0.3.1 \
    crate://crates.io/gif/0.13.1 \
    crate://crates.io/gimli/0.28.1 \
    crate://crates.io/git2/0.18.2 \
    crate://crates.io/gloo-timers/0.2.6 \
    crate://crates.io/h2/0.3.24 \
    crate://crates.io/half/2.4.0 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.14.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hkdf/0.10.0 \
    crate://crates.io/hmac/0.10.1 \
    crate://crates.io/http-body/0.4.6 \
    crate://crates.io/http-client/6.5.3 \
    crate://crates.io/http-types/2.12.0 \
    crate://crates.io/http/0.2.12 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.3 \
    crate://crates.io/hyper/0.14.28 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.60 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.5.0 \
    crate://crates.io/image/0.24.9 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indexmap/2.2.5 \
    crate://crates.io/infer/0.2.3 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inotify/0.9.6 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/itoa/1.0.10 \
    crate://crates.io/jobserver/0.1.28 \
    crate://crates.io/jpeg-decoder/0.3.1 \
    crate://crates.io/js-sys/0.3.69 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/kqueue-sys/1.0.4 \
    crate://crates.io/kqueue/1.0.8 \
    crate://crates.io/kv-log-macro/1.0.7 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lebe/0.5.2 \
    crate://crates.io/lexical-core/0.7.6 \
    crate://crates.io/libc/0.2.153 \
    crate://crates.io/libgit2-sys/0.16.2+1.7.2 \
    crate://crates.io/libz-sys/1.1.15 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/linux-raw-sys/0.4.13 \
    crate://crates.io/local-ip-address/0.5.7 \
    crate://crates.io/lock_api/0.4.11 \
    crate://crates.io/log/0.3.9 \
    crate://crates.io/log/0.4.21 \
    crate://crates.io/memchr/2.7.1 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/miniz_oxide/0.7.2 \
    crate://crates.io/mio/0.8.11 \
    crate://crates.io/neli-proc-macros/0.1.3 \
    crate://crates.io/neli/0.6.4 \
    crate://crates.io/nom/5.1.3 \
    crate://crates.io/notify/6.1.1 \
    crate://crates.io/num-conv/0.1.0 \
    crate://crates.io/num-traits/0.2.18 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/object/0.32.2 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/opaque-debug/0.3.1 \
    crate://crates.io/openssl-src/300.2.3+3.2.1 \
    crate://crates.io/openssl-sys/0.9.101 \
    crate://crates.io/os_str_bytes/6.6.1 \
    crate://crates.io/paho-mqtt-sys/0.9.0 \
    crate://crates.io/paho-mqtt/0.12.3 \
    crate://crates.io/parking/2.2.0 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.9 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/pin-project-internal/1.1.5 \
    crate://crates.io/pin-project-lite/0.2.13 \
    crate://crates.io/pin-project/1.1.5 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/piper/0.2.1 \
    crate://crates.io/pkg-config/0.3.30 \
    crate://crates.io/png/0.17.13 \
    crate://crates.io/polling/2.8.0 \
    crate://crates.io/polling/3.5.0 \
    crate://crates.io/polyval/0.4.5 \
    crate://crates.io/powerfmt/0.2.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.20+deprecated \
    crate://crates.io/proc-macro2/1.0.79 \
    crate://crates.io/qoi/0.4.1 \
    crate://crates.io/quote/1.0.35 \
    crate://crates.io/rand/0.6.5 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.1.1 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_hc/0.1.0 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rand_isaac/0.1.1 \
    crate://crates.io/rand_jitter/0.1.4 \
    crate://crates.io/rand_os/0.1.3 \
    crate://crates.io/rand_pcg/0.1.2 \
    crate://crates.io/rand_xorshift/0.1.1 \
    crate://crates.io/rayon-core/1.12.1 \
    crate://crates.io/rayon/1.9.0 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.4.1 \
    crate://crates.io/regex-syntax/0.5.6 \
    crate://crates.io/regex/0.2.11 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/rustfmt/0.10.0 \
    crate://crates.io/rustix/0.37.27 \
    crate://crates.io/rustix/0.38.31 \
    crate://crates.io/rustls/0.18.1 \
    crate://crates.io/rustversion/1.0.14 \
    crate://crates.io/ryu/1.0.17 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/sct/0.6.1 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/serde/1.0.197 \
    crate://crates.io/serde_derive/1.0.197 \
    crate://crates.io/serde_json/1.0.114 \
    crate://crates.io/serde_qs/0.8.5 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serde_with/3.7.0 \
    crate://crates.io/serde_with_macros/3.7.0 \
    crate://crates.io/sha-1/0.9.8 \
    crate://crates.io/sha1/0.10.6 \
    crate://crates.io/sha1/0.6.1 \
    crate://crates.io/sha1_smol/1.0.0 \
    crate://crates.io/sha2/0.9.9 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/simd-adler32/0.3.7 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.13.1 \
    crate://crates.io/socket2/0.4.10 \
    crate://crates.io/socket2/0.5.6 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/standback/0.2.17 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/stdweb-derive/0.5.3 \
    crate://crates.io/stdweb-internal-macros/0.2.9 \
    crate://crates.io/stdweb-internal-runtime/0.1.5 \
    crate://crates.io/stdweb/0.4.20 \
    crate://crates.io/strings/0.1.1 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/surf/2.3.2 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.52 \
    crate://crates.io/syntex_errors/0.59.1 \
    crate://crates.io/syntex_pos/0.59.1 \
    crate://crates.io/syntex_syntax/0.59.1 \
    crate://crates.io/term/0.4.6 \
    crate://crates.io/termcolor/1.4.1 \
    crate://crates.io/textwrap/0.16.1 \
    crate://crates.io/thiserror-impl/1.0.58 \
    crate://crates.io/thiserror/1.0.58 \
    crate://crates.io/thread_local/0.3.6 \
    crate://crates.io/tiff/0.9.1 \
    crate://crates.io/time-core/0.1.2 \
    crate://crates.io/time-macros-impl/0.1.2 \
    crate://crates.io/time-macros/0.1.1 \
    crate://crates.io/time-macros/0.2.17 \
    crate://crates.io/time/0.2.27 \
    crate://crates.io/time/0.3.34 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-macros/2.2.0 \
    crate://crates.io/tokio-tungstenite/0.15.0 \
    crate://crates.io/tokio-util/0.7.10 \
    crate://crates.io/tokio/1.36.0 \
    crate://crates.io/toml/0.4.10 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-core/0.1.32 \
    crate://crates.io/tracing/0.1.40 \
    crate://crates.io/try-lock/0.2.5 \
    crate://crates.io/tungstenite/0.14.0 \
    crate://crates.io/tungstenite/0.20.1 \
    crate://crates.io/typenum/1.17.0 \
    crate://crates.io/ucd-util/0.1.10 \
    crate://crates.io/unicase/2.7.0 \
    crate://crates.io/unicode-bidi/0.3.15 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-normalization/0.1.23 \
    crate://crates.io/unicode-segmentation/1.11.0 \
    crate://crates.io/unicode-width/0.1.11 \
    crate://crates.io/unicode-xid/0.1.0 \
    crate://crates.io/universal-hash/0.4.1 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/url/2.5.0 \
    crate://crates.io/urlencoding/2.1.3 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/utf8-ranges/1.0.5 \
    crate://crates.io/value-bag/1.8.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/vergen/6.0.2 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/waker-fn/1.1.1 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.92 \
    crate://crates.io/wasm-bindgen-futures/0.4.42 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.92 \
    crate://crates.io/wasm-bindgen-macro/0.2.92 \
    crate://crates.io/wasm-bindgen-shared/0.2.92 \
    crate://crates.io/wasm-bindgen/0.2.92 \
    crate://crates.io/web-sys/0.3.69 \
    crate://crates.io/webpki-roots/0.20.0 \
    crate://crates.io/webpki/0.21.4 \
    crate://crates.io/weezl/0.1.8 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.6 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.4 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.4 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.4 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.4 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.4 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.4 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.4 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.4 \
    crate://crates.io/zune-inflate/0.2.54 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

SUMMARY = "Enables compatibility of devices based on Reference Design Kit (RDK) with DAB (get-dab.com)"
HOMEPAGE = "https://github.com/device-automation-bus/dab-adapter-rs/"
LICENSE = "MIT OR Apache-2.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include dab-adapter-${PV}.inc
include dab-adapter.inc
