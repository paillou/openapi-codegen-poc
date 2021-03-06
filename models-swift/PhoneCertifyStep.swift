//
// PhoneCertifyStep.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** This step requires the client to redirect the user to the phone number certification flow. The client should then resume the booking flow by validating this step with the backend. */

public struct PhoneCertifyStep: Codable {

    public enum Name: String, Codable { 
        case certify = "PHONE_CERTIFY"
    }
    public var version: BigDecimal
    public var name: Name

    public init(version: BigDecimal, name: Name) {
        self.version = version
        self.name = name
    }


}

