#!/bin/bash

'{{ HCFS_CMD }}' dfs -rm -r -f '{{ HCFS_SCHEME }}{{ HCFS_BUCKET }}{{ TEST_LOCATION }}'
