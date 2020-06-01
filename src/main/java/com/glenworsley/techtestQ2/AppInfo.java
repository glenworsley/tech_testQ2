package com.glenworsley.techtestQ2;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

/**
 * App Info.
 *
 * Note: does not use a JSON array as in the example response because it will currently always return 1
 * AppInfo object.
 */
@JsonRootName("myapplication")
@Data
public class AppInfo {
    private String version;
    private String lastcommitsha;
    private String description;
}
