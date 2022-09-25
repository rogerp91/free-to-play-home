# ignore inline messages that are outside of the current diff
github.dismiss_out_of_range_messages

message "Thanks @#{github.pr_author} 👍👍"

# Make it more obvious that a PR is a work in progress and shouldn't be merged yet
warn("This pull request is a Work in Progress and not ready to merge") if github.pr_title.include? "[WIP]"

# Encourage contributors to write useful descriptions
warn("Please provide a Pull Request description ...") if github.pr_body.length < 20

android_lint.report_file = "app/build/reports/lint-results-debug.xml"
android_lint.lint

junit.parse "/path/to/output.xml"
junit.report

android_permissions_checker.check(
  apk: '/path/to/generated_apk_by_CI',
  permission_list_file: '/path/to/permissions.txt'
)
