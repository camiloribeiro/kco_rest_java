/*
 * Copyright 2014 Klarna AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klarna.rest.api.model;

/**
 * Address data model.
 */
public class Address extends Model {

    /**
     * Customers title.
     */
    private String title;

    /**
     * First name.
     */
    private String givenName;

    /**
     * Last name.
     */
    private String familyName;

    /**
     * Street address line 1.
     */
    private String streetAddress;

    /**
     * Street address line 2.
     */
    private String streetAddress2;

    /**
     * Postal code.
     */
    private String postalCode;

    /**
     * City.
     */
    private String city;

    /**
     * Country.
     */
    private String country;

    /**
     * Customers email.
     */
    private String email;

    /**
     * Customers phone number.
     */
    private String phone;

    /**
     * Gets the customers title.
     *
     * @return Title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the customers title.
     *
     * @param title Title
     * @return Same instance
     */
    public Address setTitle(final String title) {
        this.title = title;

        return this;
    }

    /**
     * Gets the given name.
     *
     * @return First name
     */
    public String getGivenName() {
        return this.givenName;
    }

    /**
     * Sets the given name.
     *
     * @param name First name
     * @return Same instance
     */
    public Address setGivenName(final String name) {
        this.givenName = name;

        return this;
    }

    /**
     * Gets the family name.
     *
     * @return Last name
     */
    public String getFamilyName() {
        return this.familyName;
    }

    /**
     * Sets the family name.
     *
     * @param name Last name
     * @return Same instance
     */
    public Address setFamilyName(final String name) {
        this.familyName = name;

        return this;
    }

    /**
     * Gets the street address line 1.
     *
     * @return Line 1
     */
    public String getStreetAddress() {
        return this.streetAddress;
    }

    /**
     * Sets the street address line 1.
     *
     * @param street Line 1
     * @return Same instance
     */
    public Address setStreetAddress(final String street) {
        this.streetAddress = street;

        return this;
    }

    /**
     * Gets the street address line 2.
     *
     * @return Line 2
     */
    public String getStreetAddress2() {
        return this.streetAddress2;
    }

    /**
     * Sets the street address line 2.
     *
     * @param street Line 2
     * @return Same instance
     */
    public Address setStreetAddress2(final String street) {
        this.streetAddress2 = street;

        return this;
    }

    /**
     * Gets the postal code.
     *
     * @return Postal code
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Sets the postal code.
     *
     * @param code Postal code
     * @return Same instance
     */
    public Address setPostalCode(final String code) {
        this.postalCode = code;

        return this;
    }

    /**
     * Gets the city.
     *
     * @return City
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets the city.
     *
     * @param city City
     * @return Same instance
     */
    public Address setCity(final String city) {
        this.city = city;

        return this;
    }

    /**
     * Gets the country.
     *
     * @return Country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets the country.
     *
     * @param country Country
     * @return Same instance
     */
    public Address setCountry(final String country) {
        this.country = country;

        return this;
    }

    /**
     * Gets the email address.
     *
     * @return Email address
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Sets the email address.
     *
     * @param email Email address
     * @return Same instance
     */
    public Address setEmail(final String email) {
        this.email = email;

        return this;
    }

    /**
     * Gets the phone number.
     *
     * @return Phone number
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Sets the phone number.
     *
     * @param phone Phone number
     * @return Same instance
     */
    public Address setPhone(final String phone) {
        this.phone = phone;

        return this;
    }
}
