/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.shindig.social.opensocial.spi;

import org.apache.shindig.social.ResponseError;

/**
 * Unchecked exception class for exceptions thrown by the OpenSocial
 * SPI interfaces.
 */
public class SocialSpiException extends RuntimeException {
  private final ResponseError error;

  public SocialSpiException(ResponseError error, String errorMessage, Throwable cause) {
    super(errorMessage, cause);
    this.error = error;
  }

  public SocialSpiException(ResponseError error, String errorMessage) {
    super(errorMessage);
    this.error = error;
  }

  public ResponseError getError() {
    return error;
  }
}
