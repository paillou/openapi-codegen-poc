//
// BookingResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct BookingResponse: Codable {

    public var steps: [Step]?
    /** This flow identifier is generated by the client application and embedded in the first request to Edge. It will be then added in each subsequent requests and responses of the booking flow. */
    public var flowId: UUID?

    public init(steps: [Step]?, flowId: UUID?) {
        self.steps = steps
        self.flowId = flowId
    }

    public enum CodingKeys: String, CodingKey { 
        case steps
        case flowId = "flow_id"
    }

}

