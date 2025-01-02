'use client'
import React, { useState } from 'react';

const SignupForm = () => {
  const [formData, setFormData] = useState({
    studentId: '',
    name: '',
    email: '',
    password: '',
    batch: '',
    department: '',
    role: '',
    number: ''
  });

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(formData);
  };

  return (
    <div className="min-h-screen flex items-center justify-center p-4 relative bg-gradient-to-br from-blue-50 via-indigo-50 to-purple-50">
      {/* Decorative background elements */}
      <div className="absolute inset-0 overflow-hidden">
        {/* Top-left circle */}
        <div className="absolute -top-40 -left-40 w-80 h-80 bg-blue-100 rounded-full opacity-50 blur-3xl" />
        {/* Bottom-right circle */}
        <div className="absolute -bottom-40 -right-40 w-80 h-80 bg-indigo-100 rounded-full opacity-50 blur-3xl" />
        {/* Center decoration */}
        <div className="absolute top-1/2 left-1/2 -translate-x-1/2 -translate-y-1/2 w-full h-full">
          <div className="w-full h-full bg-gradient-to-r from-blue-400/10 to-indigo-400/10 rotate-12 transform opacity-30" />
        </div>
      </div>

      {/* Main content */}
      <div className="w-full max-w-2xl p-8 bg-white/80 backdrop-blur-lg rounded-2xl shadow-xl border border-white/20">
        {/* Header */}
        <div className="text-center mb-8">
          <h2 className="text-2xl font-bold bg-gradient-to-r from-blue-600 to-indigo-600 bg-clip-text text-transparent">
            Create Your Account
          </h2>
          <p className="text-gray-600 mt-2">Join Attach-Net to get started</p>
        </div>

        {/* Form */}
        <form onSubmit={handleSubmit} className="space-y-6">
          <div className="grid md:grid-cols-2 gap-6">
            {/* Student ID */}
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-1">Student / Teacher ID</label>
              <input
                type="text"
                className="w-full p-3 bg-white border border-gray-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm transition-all hover:border-blue-400"
                placeholder="Enter your student ID"
                value={formData.studentId}
                onChange={(e) => setFormData({...formData, studentId: e.target.value})}
              />
            </div>

            {/* Name */}
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-1">Full Name</label>
              <input
                type="text"
                className="w-full p-3 bg-white border border-gray-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm transition-all hover:border-blue-400"
                placeholder="Enter your full name"
                value={formData.name}
                onChange={(e) => setFormData({...formData, name: e.target.value})}
              />
            </div>

            {/* Email */}
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-1">Email Address</label>
              <input
                type="email"
                className="w-full p-3 bg-white border border-gray-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm transition-all hover:border-blue-400"
                placeholder="Enter your email"
                value={formData.email}
                onChange={(e) => setFormData({...formData, email: e.target.value})}
              />
            </div>

            {/* Password */}
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-1">Password</label>
              <input
                type="password"
                className="w-full p-3 bg-white border border-gray-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm transition-all hover:border-blue-400"
                placeholder="Enter your password"
                value={formData.password}
                onChange={(e) => setFormData({...formData, password: e.target.value})}
              />
            </div>

            {/* Batch */}
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-1">Batch</label>
              <input
                type="text"
                className="w-full p-3 bg-white border border-gray-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm transition-all hover:border-blue-400"
                placeholder="Enter your batch"
                value={formData.batch}
                onChange={(e) => setFormData({...formData, batch: e.target.value})}
              />
            </div>

            {/* Department */}
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-1">Department</label>
              <select
                className="w-full p-3 bg-white border border-gray-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm transition-all hover:border-blue-400"
                value={formData.department}
                onChange={(e) => setFormData({...formData, department: e.target.value})}
              >
                <option value="">Select Department</option>
                <option value="CSE">CSE</option>
                <option value="EEE">EEE</option>
                <option value="ME">ME</option>
                <option value="CIVIL">Civil</option>
              </select>
            </div>

            {/* Role */}
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-1">Role</label>
              <select
                className="w-full p-3 bg-white border border-gray-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm transition-all hover:border-blue-400"
                value={formData.role}
                onChange={(e) => setFormData({...formData, role: e.target.value})}
              >
                <option value="">Select Role</option>
                <option value="student">Student</option>
                <option value="teacher">Teacher</option>
              </select>
            </div>

            {/* Phone Number */}
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-1">Phone Number</label>
              <input
                type="tel"
                className="w-full p-3 bg-white border border-gray-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm transition-all hover:border-blue-400"
                placeholder="Enter your phone number"
                value={formData.number}
                onChange={(e) => setFormData({...formData, number: e.target.value})}
              />
            </div>
          </div>

          {/* Submit Button */}
          <button 
            onClick={handleSubmit}
            type="submit"
            className="w-full py-3 px-4 bg-gradient-to-r from-blue-600 to-indigo-600 text-white rounded-xl font-medium 
            shadow-lg transition-all duration-300 ease-in-out
            hover:shadow-indigo-500/25 hover:shadow-2xl
            hover:scale-105 hover:from-blue-500 hover:to-indigo-500
            active:scale-95 active:shadow-lg
            focus:ring-2 focus:ring-blue-500 focus:ring-offset-2"
          >
            Create Account
          </button>

          {/* Sign In Link */}
          <p className="text-center text-sm text-gray-600">
            Already have an account?
            <a href="/login" className="text-blue-600 hover:text-indigo-600 font-medium hover:underline ml-1.5 transition-colors">
              Sign in
            </a>
          </p>
        </form>
      </div>
    </div>
  );
};

export default SignupForm;