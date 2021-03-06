// Copyright 2009 Google Inc. All Rights Reserved.

package com.google.appinventor.blockseditor.jsonp;

/**
 * Enum for the HTTP response codes used in {@link HttpServer}.
 *
 * @author lizlooney@google.com (Liz Looney)
 */
enum ResponseCode {
  REQUEST_OK(200, "OK"),
  BAD_REQUEST(400, "Bad Request"),
  UNAUTHORIZED(401, "Unauthorized"),
  NOT_FOUND(404, "Not Found"),
  NOT_IMPL(501, "Not Implemented"),
  SERVICE_UNAV(503, "Service Unavailable");

  private final int code;
  private final String desc;

  private ResponseCode(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  /**
   * Returns the numeric code for this HTTP response code.
   */
  int getCode() {
    return code;
  }

  /**
   * Returns the description for this HTTP response code.
   */
  String getDescription() {
    return desc;
  }
}
