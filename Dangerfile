# ignore inline messages that are outside of the current diff
github.dismiss_out_of_range_messages

message "Thanks @#{github.pr_author} 👍👍"

# Make it more obvious that a PR is a work in progress and shouldn't be merged yet
warn("This pull request is a Work in Progress and not ready to merge") if github.pr_title.include? "[WIP]"

# Encourage contributors to write useful descriptions
warn("Please provide a Pull Request description ...") if github.pr_body.length < 20

if github.pr_title.include? "[WIP]"
    auto_label.wip=(github.pr_json["number"])
else
    auto_label.remove("WIP")
    # If you want to delete label
    # auto_label.delete("WIP")
end