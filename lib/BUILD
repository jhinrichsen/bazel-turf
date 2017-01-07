package(default_visibility = ["//visibility:public"])

java_library(
    name = "a",
    srcs = glob(["src/main/java/**/*.java"]),
)

java_test(
    name = "ATest",
    srcs = glob(["src/test/java/**/*.java"]),
    deps = [
        "a",
        "@junit_junit//jar"
    ],
    size = "small",
)
