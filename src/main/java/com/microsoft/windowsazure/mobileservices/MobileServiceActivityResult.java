/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
Apache 2.0 License

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

See the Apache Version 2.0 License for specific language governing permissions and limitations under the License.
 */

package com.microsoft.windowsazure.mobileservices;

/**
 * Class for holding data that comes back from activity which was started by MobileServiceClient
 */
public class MobileServiceActivityResult {

    public MobileServiceActivityResult(boolean isLoggedIn, String errorMessage) {
        this.isLoggedIn = isLoggedIn;
        this.errorMessage = errorMessage;
    }

    /**
     * User login succeeded or not
     */
    private boolean isLoggedIn;

    /**
     * Error message
     */
    private String errorMessage;

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
